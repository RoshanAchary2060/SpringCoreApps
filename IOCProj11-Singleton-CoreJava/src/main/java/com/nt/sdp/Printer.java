package com.nt.sdp;

public class Printer {
// static reference variable
	private static Printer INSTANCE; //-2
	private Printer() {
		System.out.println("Printer-0 param const"); //-1
	}
	//public static factory method-3
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		} return INSTANCE;
	}
	
	// business method
	public void print(String msg) {
		System.out.println(msg);
	}
}
