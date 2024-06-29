package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		// get Spring bean class obj
		Person person = (Person)factory.getBean("per");
		System.out.println(person);
//		ctrl + shift + c is for single line comment
		Person1 person1 = (Person1)factory.getBean("per1");	
		System.out.println(person1);
	}
		
}
