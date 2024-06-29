package com.nt.beans;

public class A {
	private B b;
	
//	public A() {
//
//		System.out.println("A 0-param constructor");
//	}
//	public void setB(B b) {
//
//		System.out.println("Setter of A");
//		this.b = b;
//	}
	
	public A(B b) {
		System.out.println("A 1-param constructor");
		this.b = b;
	}
	
	public String toString() {
		return "from A";
	}
}
