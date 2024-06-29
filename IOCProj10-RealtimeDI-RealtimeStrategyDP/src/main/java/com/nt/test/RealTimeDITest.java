package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// Read inputs from enduser as string values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name::");
		String name = sc.next();
		System.out.println("Enter customer addrs::");
		String addrs = sc.next();
		System.out.println("Enter customer Principal amount::");
		String pAmt = sc.next();
		System.out.println("Enter customer Rate of interest::");
		String rate = sc.next();
		System.out.println("Enter Time of interest(Months)::");
		String time = sc.next();
		
		// create Customer VO class object
		CustomerVO vo = new CustomerVO();
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setPamt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get Controller class obj
		MainController controller = factory.getBean("controller", MainController.class);
		
		// invoke the methods
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch(Exception ex) {
//			ex.printStackTrace();
			System.out.println("Internal problem::Try again :: " + ex);
		}
	}

}
