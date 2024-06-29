package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl::1-param const");
		this.dao = dao;
	}
	
	@Override
	public String calculateSimpleInterest(CustomerDTO dto) throws Exception {
		// calculate simple interest amount (business logic)
		float intrAmt = dto.getPamt() * dto.getRate() * dto.getTime() / 100.0f;
		
		// create BO class object having persistable data
		CustomerBO bo = new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterestamount(intrAmt);
		
		// use DAO
		int count = dao.insert(bo);
		return count == 1? "Customer registered successfully-->SimpleInterest amount::" + intrAmt :
			"Customer registration failed!";
	}
}
	