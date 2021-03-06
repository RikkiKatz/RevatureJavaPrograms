package com.rikki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Student> classroom = new SetExample().createStudents();
		
		for(Student person: classroom){
			System.out.println(person.name);
		}
		ArrayList<Student> list = new ArrayList<>(classroom);
		Collections.sort(list);
		
		for(Student person : list){
			System.out.println("list 2: " + person.name);
		}
	}
	
	//populate students lists
	private Set<Student> createStudents(){
		HashSet<Student> list = new HashSet<>();
		Student a = new Student("Andrew Williams");
		list.add(a);
		
		list.add(new Student("Banks"));
		list.add(new Student("Sam"));
		list.add(new Student("Osher"));
		list.add(new Student("Martino"));
		list.add(new Student("Travis"));
		
		return list;
	}
		
}
