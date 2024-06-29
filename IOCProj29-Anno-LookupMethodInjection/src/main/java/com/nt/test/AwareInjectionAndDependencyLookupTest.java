package com.nt.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class AwareInjectionAndDependencyLookupTest {

	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get target spring bean class object
		Cricketer cricketer = ctx.getBean("cktr",Cricketer.class);
		System.out.println(cricketer.getClass()+"..."+cricketer.getClass().getSuperclass()+"...\n"
				+Arrays.deepToString(cricketer.getClass().getDeclaredMethods()));
		// invoke business methods
		cricketer.fielding();
		cricketer.bowling();
		cricketer.batting();
		
		// close container
		ctx.close();
		
	}

}
