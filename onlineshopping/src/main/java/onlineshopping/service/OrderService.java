package onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Customer;
import onlineshopping.bean.Orders;

import onlineshopping.dao.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	

	public List<Orders> getOrderDetailsFromSpringData() {
		return orderRepository.findAll();
	}
	
	public String storeOrder(Orders oo) {
		
		Optional<Orders> op = orderRepository.findById(oo.getOrderid());
		if(op.isPresent()) {
			return "Already Ordered";
		}else {
			Orders c = orderRepository.save(oo);			// save the records 
			if(c!=null) {
				return "Order Placed";
			}else {
				return "Cannot Order";
			}
		}
		
	}


	public String deleteOrder(int orderid) {
		if(orderRepository.existsById(orderid))
		{
			orderRepository.deleteById(orderid);
			return "Order Cancelled";
		}else {
			return "";
		}
		
	} 

	

}
