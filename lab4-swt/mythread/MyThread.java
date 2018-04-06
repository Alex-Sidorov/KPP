package mythread;

import java.util.LinkedList;

import complex.Complex;
/**
 * This class implements thread for calculate roots of complex value.
 */
public class MyThread extends Thread{
	/**
	 * The method runs thread.
	 */
	public void run(){
		myList=myValue.sqrtDegreeN(degreeValue);
	}
	
	/**
	 * The method returns list of result.
	 * @return myList This is list of result.
	 */
	public LinkedList<Complex> getList(){
		return myList;
	}
	
	/**
	 * The method changes myValue.
	 * @param value This is a new complex value.
	 */
	public void setComplexValue(Complex value){
		myValue = value;
	}
	/**
	 *The method changes degreeValue.
	 * @param value This is a new value.
	 */
	public void setDegreeValue(int value){
		degreeValue = value;
	}
	
	/**
	 * This is value for work.
	 */
	private Complex myValue;
	/**
	 * This is list for results.
	 */
	private LinkedList<Complex> myList;
	/**
	 * This is value for degree.
	 */
	private int degreeValue;
}
