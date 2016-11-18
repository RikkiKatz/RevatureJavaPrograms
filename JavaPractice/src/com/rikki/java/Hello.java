package com.rikki.java;

public class Hello {
	
	//variables (state)
	int i;
//	String // class -- char[] non-primitive data type
	boolean b;
	float f;
	char c;
	long l;
	double d;
	short s;
	byte by;
	String referenceVariable; // requires reference variable
	static int num;	//class variable
	static final int number=100; //value cannot be changed
	
	final static Hello obj = new Hello();
	
	//methods (behavior)
	
	//entry point for your application
	public static void main(String[] args) {
		System.out.println(obj);
		Hello hello = new Hello(); // local variable
	}
	
	public void go(){
		i =10;
		obj.d=100;
	}
	
	/**
	 * private - accessed only within the class
	 *  default - class, package
	 *   protected - class, package, sub-class
	 *    public- anyone can access
	 */

	/**					varargs
	public void process(Student... students){
		
	})
	**/
}
