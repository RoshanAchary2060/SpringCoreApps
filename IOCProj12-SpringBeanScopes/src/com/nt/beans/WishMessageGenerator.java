// Target class
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date; // control+shift+o to import packages

	public void setDate(Date date) {
		System.out.println("WMG: setDate()");
		this.date = date;
	}
	
	public WishMessageGenerator() {
		System.out.println("WMG:0 param const");
	}
	
	// develop business method
	public String generateWishMessage(String user) {
		// get current hour of the day
		int hour = date.getHours(); // 24 hr format
		if(hour < 12) return "GM:"+ user;
		else if(hour<16) return "GA:"+user;
		else if(hour<20) return "GE:"+user;
		else return "GN:"+user;
	}
}
