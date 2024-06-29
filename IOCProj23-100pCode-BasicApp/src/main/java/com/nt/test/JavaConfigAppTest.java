package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		// create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get Target class object
//		WishMessageGenerator generator = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		
		// invoke business method
		System.out.println(generator.generate("raja"));
		
		// get LocalDateTime class obj from IOC container
		

//		LocalDateTime dt = ctx.getBean("createLocalDateTime", LocalDateTime.class);
		LocalDateTime dt = ctx.getBean("ldt", LocalDateTime.class);
		System.out.println("dt hashCode()-> " + dt.hashCode());
		
		// close the container
		ctx.close();
	}

}
