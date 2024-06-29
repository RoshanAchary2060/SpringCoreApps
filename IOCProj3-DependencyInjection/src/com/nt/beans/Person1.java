package com.nt.beans;

public class Person1 {

	public Person1(int pid, String pname, String paddrs, float income) {
		System.out.println("Inside constructor of Person1");
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.income = income;
	}
	private int pid;
	private String pname;
	private String paddrs;
	private float income;
	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
	}
	
	
}
