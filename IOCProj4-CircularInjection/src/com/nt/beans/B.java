package com.nt.beans;

public class B {
	private A a;
	
//	public B() {
//		System.out.println("B 0-param constructor");
//	}
//	
//	public void setA(A a) {
//		System.out.println("Setter of B");
//		this.a = a;
//	}
	
	public B(A a) {
		System.out.println("B 1-param constructor");
		this.a = a;
	}
	
	public String toString() {
		return "from B";
	}
}
