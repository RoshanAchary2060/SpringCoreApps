package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// Locate and hold spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		// create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		// get TargetBean class object
		Object obj = factory.getBean("wmg");
		// typeCasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		// invoke the business method
		String result = generator.generateWishMessage("raja jee");
		System.out.println("Result : "+ result);
	}

}
