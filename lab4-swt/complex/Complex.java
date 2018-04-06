package complex;

import java.util.LinkedList;
/**
 * This class implements complex value.
 */
public class Complex {
	/**
	 * The method creates complex value.
	 * @param realValue This is real.
	 * @param imageValue This is image.
	 */
	public Complex(double realValue, double imageValue){
		real=realValue;
		image=imageValue;
	}
	/**
	 * This is default constructor for a complex value. 
	 */
	public Complex(){
		real=0;
		image=0;
	}
	/**
	 * The method changes real value. 
	 * @param realValue This is a new real value.
	 */
	public void setReal(double realValue){
		real=realValue;
	}
	/**
	 * The method changes image value.
	 * @param imageValue This is a new image value.
	 */
	public void setImage(double imageValue){
		image=imageValue;
	}
	/**
	 * The method returns real value.
	 * @return real This is real value.
	 */
	public double getReal(){
		return real;
	}
	/**
	 * The method returns image value.
	 * @return real This is image value.
	 */
	public double getImage(){
		return image;
	}
	/**
	 * The method calculates module for this complex value.
	 * @return value module.
	 */
	public double abs(){
		return Math.sqrt(real*real+image*image);
	}
	/**
	 * The method calculates root this complex value for degree.  
	 * @param degree This is degree for method.
	 * @return result This is results all root.
	 */
	public LinkedList<Complex> sqrtDegreeN(int degree){
		LinkedList<Complex> result = new LinkedList<Complex>();
	
		double realValue = 0;
		double imageValue = 0;
		
		for(int k=0; k<degree; k++){
			realValue = Math.pow(this.abs(), 1.0/degree)*Math.cos((Math.acos(real/this.abs())+2*Math.PI*k)/degree);
			imageValue = Math.pow(this.abs(), 1.0/degree)*Math.sin((Math.acos(real/this.abs())+2*Math.PI*k)/degree);
			result.add(new Complex(realValue,imageValue));
		}
		return result;
	}
	/**
	 * This is a new real value.
	 */
	private double real;
	/**
	 * This is a new complex value.
	 */
	private double image;
}
