package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemResource rs = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(rs);
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		System.out.println(generator.generateWishMessage("raja"));
	}

}
