package com.nt.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fEx")
@Scope("prototype")
public final class FedEx implements Courier {

	public FedEx() {
		System.out.println("FedEx::0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + " order id order product using FedEx courier service";
	}

}
