package onlineshopping.service;


import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Customer;
import onlineshopping.dao.CustomerRepository;
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;
	
	public List<Customer>getAllCustomerFormSpringData(){
		return cr.findAll();
	   }
	
	public Customer getCustomerSpringDataById(String username) {
		
		Optional<Customer>op=cr.findById(username);

		if(op.isPresent()) {
			return op.get();
		}else {
		return null;
		}
	}

	
	
	
	public String storeCustomerSpringData(Customer cc) {
		Optional<Customer>op=cr.findById(cc.getUsername());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Customer c=cr.save(cc);
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}

	
	public String deleteCustomerSpringData(String username) {
		
		 
		if(cr.existsById(username)) {
			cr.deleteById(username);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
		
	}
	
	
	public String updateCustomerSpringData(Customer cc) {

	     Optional<Customer> obj=cr.findById(cc.getUsername());
		   if(obj.isPresent()) {
			Customer c=obj.get();
			if(c!=null) {
		
//			c.setMobileno(cc.getMobileno());
			c.setPassword(cc.getPassword());
	        cr.saveAndFlush(c);
	        return "Record updated successfully";
			}else {
				return "Record didnt updated";
			}
		}else {
			return "record is not present";
		}
	}
}
	

