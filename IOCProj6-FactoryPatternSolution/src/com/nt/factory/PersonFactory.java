package com.nt.factory;

import com.nt.comp.Employee;
import com.nt.comp.Food;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {

	// static factory method ( having logic of factory pattern
	public static Person getPerson(String type) {
		// create dependent class object
		Food food = new Food();
		
		//create target class object
		Person per = null;
		if(type.equalsIgnoreCase("emp")) {
			per = new Employee(food);
		} else if(type.equalsIgnoreCase("stud")) {
			per = new Student(food);
		} else {
			throw new IllegalArgumentException("Invalid person type!");
		}
		return per;
	}
	
}
