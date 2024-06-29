package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // not passing any resource object
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Spring bean class object
//		Person person = (Person)factory.getBean("per");
		Person person = factory.getBean("per", Person.class);
		System.out.println(person);
//		control + shift + c is for single line comment
//		Person1 person1 = (Person1)factory.getBean("per1");	
		Person1 person1 = factory.getBean("per1",Person1.class);
		System.out.println(person1);
	}
		
}
