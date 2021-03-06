package com.rikki.exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionsExample {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try { // code that may throw an exception
			FileReader fileReader= new FileReader("data1.txt");
			
			// Character stream
			reader = new BufferedReader(fileReader);
			String line = reader.readLine();
			System.out.println("Contents of file: " + line);
			
			//write();
		
		} catch (FileNotFoundException e) {
			// recovery procedures 
			System.out.println("File wasn't found.");
		}catch (IOException e){
			System.out.println("Couldn't read the file.");
		}catch(Exception e){
			System.out.println("Generic error message.");
		}finally{	//executes whether or not exception is thrown
			try {
				if(reader!= null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Application is still running!");
	}
	
	public static void write() throws FileNotFoundException {
		// writes to a file
		PrintWriter writer = new PrintWriter("data1.txt");	
		writer.println("Hello, data1");
		writer.close();
	}
	
}
