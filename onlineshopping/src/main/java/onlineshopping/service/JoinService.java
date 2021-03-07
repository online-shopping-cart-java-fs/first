package onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.dao.JoinDao;

@Service
public class JoinService {

	@Autowired
	JoinDao jd;
	
	
	public List<Object[]> getCustomerAddressDetails(String username) {
		return jd.getCustomerAddressInfo(username);
	}
	
	public List<Object[]> getCustomerOrdersDetails(String username) {
		
		
		return jd.getCustomerOrdersInfo(username);
	}
	
	
}
