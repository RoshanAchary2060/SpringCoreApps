package com.nt.beans;

public class Person {
	private int pid;
	private String pname;
	private String paddrs;
	private float income;
	
	// alt + shift + s,s
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ", income=" + income + "]";
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public void setIncome(float income) {
		this.income = income;
	}
}
