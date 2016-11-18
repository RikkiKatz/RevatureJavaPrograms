package com.rikki.exceptions;

public class RunTimeExamples {

	static Door door = new Door();
	
	public static void main(String[] args) {
		new House().close(door	);
		
	}
	
}

class House{
	public void close(Door door){
		if(door != null)	//null check
			door.close();
		else
			System.out.println("Door not found.");
	}
}

class Door{
	public void close(){
		System.out.println("Closing door..");
	}
}
