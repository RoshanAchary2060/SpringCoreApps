package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// get target class obj
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);

		// invoke the business method
		String result = fpkt.shopping(new String[] { "mangoes", "tamarind", "sugarcanes" },
				new float[] { 500.0f, 600.0f, 700.0f });
		System.out.println(result);

	}

}
