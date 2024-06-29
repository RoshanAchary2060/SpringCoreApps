package com.nt.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
//@Service("fpkt")
@Scope("singleton")
//@Component
//@PropertySource("com/nt/commons/info1.properties")
//@PropertySources(value= {@PropertySource("com/nt/commons/info.properties"),
//		@PropertySource("com/nt/commons/info1.properties")})
//@PropertySource("com/nt/commons/info.properties")
//@PropertySource("com/nt/commons/info1.properties")
@PropertySource(value={"com/nt/commons/info.properties","com/nt/commons/info1.properties"})
public final class Flipkart {
	@Autowired
//	@Qualifier("dtdc")
	//@Qualifier("@Value("${courier.id}")") wrong
	//@Qualifier("${courier.id}") wrong
	@Qualifier("courier")
	private Courier courier;
	
	@Autowired
	private Date myDate;
	
//	@Value("https://www.flipkart.com")
	@Value("${fpkt.info.url}")
	private String url;
	
//	@Value("300")
	@Value("${fpkt.info.size}")
	private int size;
	
	@Value("raja")
	private String name;
	
	@Value("${os.name}") // injects system property value
	private String os;
	
	@Value("${Path}") // injects path env variable value
	private String pathValue;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	// business method
	public String shopping(String[] items, float[] prices) {
		System.out.println("Flipkart.shopping()::"+name+","+url+","+size+","+myDate+","+os+","+pathValue);
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
