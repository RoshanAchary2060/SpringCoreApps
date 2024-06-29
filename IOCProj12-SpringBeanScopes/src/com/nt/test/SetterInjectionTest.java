package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get TargetBean bean class object ref

		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(generator1.hashCode() + " " + generator2.hashCode());
		System.out.println("generator1==generator2 ? " + (generator1 == generator2));

//			WishMessageGenerator generator3 = factory.getBean("wmg1", WishMessageGenerator.class);
//			WishMessageGenerator generator4 = factory.getBean("wmg1", WishMessageGenerator.class);
//			System.out.println(generator3 .hashCode() + " " + generator4.hashCode());
//			System.out.println("generator3==generator4 ? " + (generator3==generator4));
//		// invoke the business method
//			String result = generator1.generateWishMessage("raja");
//		System.out.println	("Result : "+ result);

		Printer p11 = factory.getBean("p1", Printer.class);
		Printer p12 = factory.getBean("p1", Printer.class);
		System.out.println(p11.hashCode() + " " + p12.hashCode());
//		Printer p21 = factory.getBean("p2", Printer.class);
//		Printer p22 = factory.getBean("p2", Printer.class);
//		System.out.println(p21.hashCode() + " " + p22.hashCode());

	}

}
