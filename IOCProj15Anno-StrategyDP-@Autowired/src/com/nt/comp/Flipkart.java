package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	@Autowired(required = false)
	@Qualifier("fEx")
	private Courier courier;

	@Autowired
	// @Qualifier("fEx") //not supported here
	public Flipkart(@Qualifier("dtdc") Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart::1-param constructor");
	}

	// @Autowired(required=false) // writing required=false also does not work
//	public Flipkart(int x) {
//		System.out.println("Flipkart::1-param constructor");
//	}

	@Autowired
	@Qualifier("fFlight")
	public void assign(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.assign()");
	}
	@Autowired
	@Qualifier("bDart")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	

	// business method
	public String shopping(String[] items, float[] prices) {
		float billAmt = 0.0f;
		for (float p : prices)
			billAmt += p;

		// generate order id
		int oid = new Random().nextInt(1000);
		// use courier
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " with prices " + Arrays.toString(prices) + " having billamt " + billAmt + ":::"
				+ msg;
	}
}
