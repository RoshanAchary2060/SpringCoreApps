package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
//@Service("fpkt")
@Scope("singleton")
//@Component
public final class Flipkart {
	@Autowired
	@Qualifier("fEx")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
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
