package onlineshopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import onlineshopping.bean.Customer;
import onlineshopping.dao.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Optional<Customer> getCustomer(String username) {
		
		return customerRepository.findById(username);
	}
	
	public String storeCustomerSpringData(Customer cc) {
		
		Optional<Customer>op=customerRepository.findById(cc.getUsername());
		if(op.isPresent()) {
			return "Sign Up with different username";
		}else {
			Customer c=customerRepository.save(cc);
			if(c!=null) {
				return "Sign Up Successful";
			}else {
				return "Cannot Sign Up";
			}
		}
	}

	
	public String deleteCustomerSpringData(String username) {
		
		 
		if(customerRepository.existsById(username)) {
			customerRepository.deleteById(username);
			return "Account Deleted";
		}else {
			return "";
		}
		
	}
	
	
	public String updateCustomerSpringData(Customer cc) {

	     Optional<Customer> obj=customerRepository.findById(cc.getUsername());
		   if(obj.isPresent()) {
			Customer c=obj.get();
			if(c!=null) {
			c.setAccnum(cc.getAccnum());
			c.setPassword(cc.getPassword());
			c.setAddress(cc.getAddress());
			c.setMobnum(cc.getMobnum());
	        customerRepository.saveAndFlush(c);
	        return "Profile Updated";
			}else {
				return "Error";
			}
		}else {
			return "";
		}
	}
}
	

