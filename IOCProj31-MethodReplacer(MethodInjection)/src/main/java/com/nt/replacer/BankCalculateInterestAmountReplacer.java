package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankCalculateInterestAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
		System.out.println("BankCalculateInterestAmountReplacer.reimplement()");
		double pamt = (double)args[0];
		double rate = (double)args[1];
		double time = (double)args[2];
		
		// calculate simple interest amount
		return (pamt*rate*time)/100;
	}

}
