package window;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import complex.Complex;
import mythread.MyThread;

import java.util.LinkedList;
/**
 * The lab4(swt) program implements an application
 *that realizes calculate roots of complex value.
 * @author Alex Sidorov
 * @version 1.0
 * @since 2018-04-01
 */
public class Main {
	/**
     *This method creates window. 
     * @param args This is the default parameter.
     */
	public static void main(final String[]args){
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(400, 400);
		
		GridData gridDate = new GridData();
		gridDate.horizontalAlignment = GridData.FILL;
		gridDate.grabExcessHorizontalSpace = true;
		
		GridLayout gridLayout= new GridLayout();
		gridLayout.numColumns = 1;
		
		Label realLabel= new Label(shell,SWT.NONE);
		realLabel.setText("Real:");
	
		Text fieldForReal = new Text(shell,SWT.BORDER);
		
		Label imageLabel= new Label(shell,SWT.NONE);
		imageLabel.setText("Image:");
	
		Text fieldForImage = new Text(shell,SWT.BORDER);

		Label degreeLabel= new Label(shell,SWT.NONE);
		degreeLabel.setText("Degree:");
		
		Text fieldForDegree = new Text(shell,SWT.BORDER);
	
		Button result = new Button(shell,SWT.NONE);
		result.setText("Result");
	
		Table table = new Table(shell, SWT.BORDER);
		
		result.addListener(SWT.Selection, new Listener(){
			
			@Override
			public void handleEvent(Event ev) {
				
				Complex value;
				int degree;
				double real;
				double image;
				
				try{
					real = Double.parseDouble(fieldForReal.getText());
					image = Double.parseDouble(fieldForImage.getText());
					degree = Integer.parseInt(fieldForDegree.getText());
				}catch(java.lang.NumberFormatException exc){
					
					while(0 < table.getItemCount()){
						table.remove(0);
					}
					return;
				}
				
				value = new Complex(real,image);
				
				MyThread myThread = new MyThread();
				myThread.setComplexValue(value);
				myThread.setDegreeValue(degree);
				
				Thread thread = new Thread(myThread);
				thread.start();
				
				try{
					thread.join();
				}catch(InterruptedException exc){
					while(0< table.getItemCount()){
						table.remove(0);
					}
					TableItem item = new TableItem(table, SWT.NONE);
					item.setText("Error");
				}

				LinkedList<Complex> result = myThread.getList();
				
				while(0< table.getItemCount()){
					table.remove(0);
				}
				showResult(table,result);
			}		
		});
		
		shell.setLayout(gridLayout);
		shell.open();

		while (!shell.isDisposed()) {
			
			table.setSize(new Point(350,150));
			fieldForReal.setSize(100, 20);
			fieldForImage.setSize(100, 20);
			fieldForDegree.setSize(100, 20);
			
			 if (!display.readAndDispatch()) 
				  display.sleep();
		}
	}
	/**
	 * The method adds values of results to table.
	 * @param table This is place for results.
	 * @param result This is all results.
	 */
	private static void showResult(Table table, LinkedList<Complex> result){
		for(int i=0; i<result.size();i++){
			String str = new String("N " + i + ": ");
			str += String.valueOf(result.get(i).getReal());
			
			if(result.get(i).getImage()>=0){
				str +=" +i*";
			}
			else{
				str +=" -i*";
			}
			str += String.valueOf(Math.abs(result.get(i).getImage()));
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(str);
		}
	}
}
