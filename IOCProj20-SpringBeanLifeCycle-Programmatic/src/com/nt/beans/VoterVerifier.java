package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterVerifier implements InitializingBean, DisposableBean {

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

	// business method
	public String checkVotingEligibility() {
		// destroy life cycle method
		if (age < 18) {
			return "Mr./Miss/Mrs." + name + ", you are not eligible for voting..." + "wait " + (18 - age)
					+ " years to cast your vote";
		}
		return "Mr./Miss/Mrs." + name + ", you are eligible for voting...Dont't wait on--->!" + this.verificationDate;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("VoterVerifier.destroy(DisposableBean(I))");

		// nullifying bean properties
		name = null;
		age = 0;
		verificationDate = null;

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterVerifier.afterPropertiesSet() (InitializingBean(I))");
		verificationDate = new Date(); // initializing bean property that is not participating in injections

		// validation
		if (name == null || name == "" || age <= 0) {
			throw new IllegalArgumentException("Invalid inputs are given for name, age properties");
		}
	}

}
