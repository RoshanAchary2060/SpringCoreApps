package com.nt.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
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
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		// get Controller class obj
		MainController controller = ctx.getBean("controller", MainController.class);
		
		// invoke the methods
		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch(Exception ex) {
//			ex.printStackTrace();
			System.out.println("Internal problem::Try again :: " + ex);
		}
		finally {
			ctx.close();
			System.out.println("IOC Container closed successfully...");
		}
	}

}
