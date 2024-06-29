package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	
	// static factory method having factory pattern logic
	public static Flipkart getInstance(String courierType) {
		// create dependent class obj
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else if(courierType.equalsIgnoreCase("bDart")) {
			courier = new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid Courier type!");
		}
		
		// create Target class obj
		Flipkart fpkt = new Flipkart();
		// assign Dependent class obj to target class obj
		fpkt.setCourier(courier);
		return fpkt;
	}
}
