package com.nt.comp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.comp.Courier;

@Component("fEx")
@Scope("prototype")
public final class FedEx implements Courier {
	
	@Value("${fpkt.info.url}")
	private String crUrl;

	public FedEx() {
		System.out.println("FedEx::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + " order id order product using FedEx courier service,"+crUrl;
	}

}
