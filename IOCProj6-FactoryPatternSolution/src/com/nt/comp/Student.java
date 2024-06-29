package com.nt.comp;

public class Student extends Person {
	private int rollNo;
	private String course;
	
	// has a property (Composition)
	private Food food;
	
	public Student(Food food) {
		System.out.println("Student 1-param Constructor");
		this.food = food;
	}
	
	@Override
	public void work() {
		System.out.println("Sutdent is studying B.Tech(CS) and taking " + food);
	}

}
