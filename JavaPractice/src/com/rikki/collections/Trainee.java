package com.rikki.collections;

import java.util.Comparator;

public class Trainee implements Comparable<Trainee> {
	
	//encapsulated, getter/setter naming, no-arg constructor
	private int id;
	private String name;
	private String major;
	
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", major=" + major + "]";
	}

	//static nested class to compare names
	//allows for creating an object from this class 
	//without making an object from the outer class
	static class TraineeNameComparator implements Comparator<Trainee>{

		//compare one object to another
		@Override
		public int compare(Trainee one, Trainee another) {
			return one.name.compareTo(another.name);
		}
	}
	
	//nested class to compare majors
	class TraineeMajorComparator implements Comparator<Trainee>{

		//compare one object to another
		@Override
		public int compare(Trainee one, Trainee another) {
			return one.major.compareTo(another.major);
		}
	}
	
	public Trainee() {
		super();
	}
	
	public Trainee(int id, String name, String major) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	/* int hash = id + (name.charAt(0)) + (major.charAt(0));
		return hash;
	*/
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (id != other.id)
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Trainee other) {
		// natural sort is ID from least to greatest
		//0 is equal, negative is less than, positive is greater than
		return this.id-other.id;
	}
	
}
