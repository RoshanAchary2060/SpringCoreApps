package com.roshanpro.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roshanpro.beans.Robot;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/roshanpro/cfgs/applicationContext.xml");
		
		// get bean
		Robot robot = ctx.getBean("robot", Robot.class);
		System.out.println(robot);
//		Robot robot1 = ctx.getBean("com.roshanpro.beans.Robot#0", Robot.class);
//		System.out.println(robot1);
//		Robot robot2 = ctx.getBean("com.roshanpro.beans.Robot#1", Robot.class);
//		System.out.println(robot2);
	}

}
 