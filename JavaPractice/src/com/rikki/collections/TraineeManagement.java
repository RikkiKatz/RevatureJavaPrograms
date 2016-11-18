package com.rikki.collections;

import java.util.HashSet;

public class TraineeManagement {

	public static void main(String[] args) {
		Trainee a = new Trainee(1, "Dan Pickles", "IT");
		Trainee b = new Trainee(1, "Dan Pickles", "IT");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		HashSet<Trainee> set = new HashSet<Trainee>();
		System.out.println(a);
		System.out.println(b);
		set.add(a); set.add(b);
		
		for(Trainee t : set){
			System.out.println(t.getName());
		}
	}
	
}
