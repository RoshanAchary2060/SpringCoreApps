package com.nt.bo;

public class CustomerBO {
	// bean properties
	private String custName;
	private String custAddrs;
	private Float pamt;
	private Float rate;
	private Float time;
	private Float interestamount;
	
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + ", interestamount=" + interestamount + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getInterestamount() {
		return interestamount;
	}
	public void setInterestamount(Float interestamount) {
		this.interestamount = interestamount;
	}
}
