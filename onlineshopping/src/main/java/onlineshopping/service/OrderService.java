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
	
	public String storeOrderSpringData(Orders aa) {
		Optional<Orders> op = orderRepository.findById(aa.getOrderid());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Orders c = orderRepository.save(aa);			// save the records 
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
		
	}

	public String updateOrderSpringData(Orders aa) {
		Optional<Orders> obj = orderRepository.findById(aa.getOrderid());
		if(obj.isPresent()) 
		{
			Orders o	 = obj.get();
			o.setOrderdate(aa.getOrderdate());
			o.setPrice(aa.getPrice());
			
			
		orderRepository.saveAndFlush(o);
		return "Record updated successfully";
		}
		else 
		{
			return "Record not present";
		}
		
	}

	public String deleteOrderSpringData(int oid) {
		if(orderRepository.existsById(oid))
		{
			orderRepository.deleteById(oid);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
		
	}

	

}
