package onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.CustomerOrders;
import onlineshopping.dao.CustomerOrdersDao;

@Service
public class CustomerOrdersService {
	
	@Autowired
	CustomerOrdersDao customerOrdersDao;
	
	public List<CustomerOrders> getAllOrdersByCustomer(String username) {
		return customerOrdersDao.getAllOrdersByCustomer(username);
	}

}
