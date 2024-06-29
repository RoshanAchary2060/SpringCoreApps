package com.nt.beans;

public class Bank {
	public double calculateInterestAmount(double pAmt, double rate, double time) {
		System.out.println("Bank.calculateInterestAmount()");
		return pAmt * Math.pow(1 + rate / 100, time) - pAmt;
	}
}
