package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class VoterVerifier {

	@Value("${vt.name}")
	private String name;
	@Value("${vt.age}")
	private float age;
	private Date verificationDate;

	public VoterVerifier() {
		System.out.println("VoterVerifier::0-param constructor)");

	}

	

	// init life cycle method
	@PostConstruct
		public void myInit() {
			System.out.println("VoterVerifier.myInit() (custom init method)");
			verificationDate = new Date(); // initializing bean property that is not participating in injections
			
			// validation
			if(name == null  || name == "" || age<=0) {
				throw new IllegalArgumentException("Invalid inputs are given for name, age properties");
			}
		}
		
		// destroy life cycle method
	@PreDestroy
		public void myDestroy() {
			System.out.println("VoterVerifier.myDestroy()");
			
			// nullifying bean properties
			name = null;
			age = 0;
			verificationDate = null;
		}
	// business method
	public String checkVotingEligibility() {
		// destroy life cycle method
		if (age < 18) {
			return "Mr./Miss/Mrs." + name + ", you are not eligible for voting..." + "wait " + (18 - age)
					+ " years to cast your vote";
		}
		return "Mr./Miss/Mrs." + name + ", you are eligible for voting...Dont't wait on--->!" + this.verificationDate;
	}

	
}
