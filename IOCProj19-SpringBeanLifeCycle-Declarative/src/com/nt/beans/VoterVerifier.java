package com.nt.beans;

import java.util.Date;

public class VoterVerifier {

	private String name;
	private float age;
	private Date verificationDate;

	public VoterVerifier() {
		System.out.println("VoterVerifier::0-param constructor)");

	}
	
	// setter methods for setter injection
	public void setName(String name) {
		System.out.println("VoterVerifier.setName()");
		this.name = name;
	}
	public void setAge(float age) {
		System.out.println("VoterVerifier.setAge()");
		this.age = age;
	}
	
	// init life cycle method
	public void myInit() {
		System.out.println("VoterVerifier.myInit() (custom init method)");
		verificationDate = new Date(); // initializing bean property that is not participating in injections
		
		// validation
		if(name == null  || name == "" || age<=0) {
			throw new IllegalArgumentException("Invalid inputs are given for name, age properties");
		}
	}
	
	// destroy life cycle method
	public void myDestroy() {
		System.out.println("VoterVerifier.myDestroy()");
		
		// nullifying bean properties
		name = null;
		age = 0;
		verificationDate = null;
	}
	
	// business method
	public String checkVotingEligibility() {
		if(age < 18) {
			return "Mr./Miss/Mrs." + name+", you are not eligible for voting..."
					+ "wait "+(18-age) + " years to cast your vote";
		}
		return "Mr./Miss/Mrs." + name+", you are eligible for voting...Dont't wait on--->!"+this.verificationDate;
	}
	
}
