package com.rikki.string;

public class StringClass {
	
	public static void main(String[] args) {
		String word = "Stringy";
		String word2 = "Stringy";
		String word3 = new String ("Stringy");
				
		System.out.println(word);
		System.out.println(word==word2);
		System.out.println(word2==word3);
		System.out.println(word.equals(word2));
	
	}
}
