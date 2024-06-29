package com.nt.test;

import com.nt.comp.Employee;
import com.nt.comp.Food;

public class SoftwareCompany {

	public static void main(String[] args) {
		// Software Company needs Employee
		//create dependent class obj
		Food food = new Food();
		
		Employee emp = new Employee(food);
		emp.work();
	}

}
