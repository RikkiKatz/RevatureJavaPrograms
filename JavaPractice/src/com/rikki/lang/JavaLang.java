package com.rikki.lang;

public class JavaLang {
	public static void main(String[] args) {
		
		boolean isRunning = false;
		//must execute at least once
		do {
			System.out.println("do-while");
		}while(isRunning);
		
		int[] array = {0, 1, 2, 3, 4, 5};
		int count =0;
		for(int index =0; index < array.length; index++){
			System.out.println(array[index]);
			count+=array[index];
		}
		System.out.println("Total value of all numbers in the array is: " + count);
		
		int count2 =0;
		//for each temporary var in the array
		for(int temp:array){
			System.out.println(temp);
			count2+=array[temp];
		}	
		System.out.println(count2);
	
		
		char a = 'b';
		switch(a){
			case 'a':{
				System.out.println("char is 'a'");
				break;
			}
			case 'b':{
				System.out.println("char is 'b'");
				break;
			}
			case 'A':{
				System.out.println("char is 'A'");
				break;
			}
			default:{
				System.out.println("char is something else");
			}
		}
	}
}
