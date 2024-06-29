// Target class
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; // control+shift+o to import packages

	public WishMessageGenerator(Date date) {
		System.out.println("Constructor");
		System.out.println(date);
		this.date = date;
	}
	
	public void setDate(Date date) {
		System.out.println("Setter method");
		this.date = date;
	}
	
	// develop business method
	public String generateWishMessage(String user) {
		System.out.println(date);
		// get current hour of the day
		int hour = date.getHours(); // 24 hr format
		if(hour < 12) return "GM:"+ user;
		else if(hour<16) return "GA:"+user;
		else if(hour<20) return "GE:"+user;
		else return "GN:"+user;
	}
}
