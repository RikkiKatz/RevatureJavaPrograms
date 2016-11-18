package com.rikki.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		//nested class reference variable syntax
		//nested class instantiation
		Trainee.TraineeMajorComparator majorComparator = new Trainee().new TraineeMajorComparator();
		
		//static nested class instantiation
		Trainee.TraineeNameComparator nameComparator= new Trainee.TraineeNameComparator();
	
		List<Trainee> classroom = new ArrayList<>();
		classroom.add(new Trainee (3, "Dan P ", "IT"));
		classroom.add(new Trainee (2, "Ray L ", "CS"));
		classroom.add(new Trainee (1, "Howard J ", "Business"));
		Collections.sort(classroom, nameComparator);
		
		for(Trainee t : classroom){
			System.out.println(t);
		}
		
	}
}
