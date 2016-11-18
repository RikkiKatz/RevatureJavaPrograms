package com.rikki.trash;

public class GCExample {

	public static void main(String[] args) {
		
		House house= new House();
		house=null;
		System.gc();
//		for(; ;){}
	}
	
}

class House{
	boolean lightsOn;
	
	protected void finalize() throws Throwable{
		//last check for cleanup
		for(; ;) System.out.println("Trash");
		
//		if(lightsOn)
//			lightsOn= false;	// turn off
		/*
		 * Pseudo-syntax:
		 * 
		 * if(database.isConnected()) dataBase.close();
		 */
	}
}