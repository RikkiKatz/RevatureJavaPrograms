package com.rikki.java;

public class Objects {

	public static void run(){
		int[] intArray = new int[5];	//needs to know how much memory to allocate
		System.out.println(intArray[1]);
		int[] diff = {1,2,3,4,5};		//initialize with values
		System.out.println(diff[3]);
		
		intArray[0]=100;
		System.out.println(intArray[0]);
	}
	
	public static void main(String[] args) {
		run();
	}
	
}
