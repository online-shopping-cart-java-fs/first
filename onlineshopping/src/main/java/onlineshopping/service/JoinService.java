package onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.dao.JoinDao;

@Service
public class JoinService {

	@Autowired
	JoinDao jd;
	
	public List<Object[]> getCustomerCreditNumDetails(int custid) {
		return jd.getCustomerAccountDetails(custid);
	}
	
	public List<Object[]> getCustomerAddressDetails(int custid) {
		return jd.getCustomerAddressInfo(custid);
	}

	public List<Object[]> getOrdersDetails(int custid) {
		
		return jd.getCustomerOrderDetails(custid);
	}
	
	
}
