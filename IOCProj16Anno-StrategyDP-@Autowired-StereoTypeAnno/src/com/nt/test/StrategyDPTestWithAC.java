package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comp.Flipkart;

public class StrategyDPTestWithAC {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get target class obj
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
//		Flipkart fpkt = ctx.getBean("flipkart", Flipkart.class);
		// invoke the business method
		String result = fpkt.shopping(new String[] { "mangoes", "tamarind", "sugarcanes" },
				new float[] { 500.0f, 600.0f, 700.0f });
		System.out.println(result);
		ctx.close();
	}

}
