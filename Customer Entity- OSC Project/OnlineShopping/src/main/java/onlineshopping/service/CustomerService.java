package onlineshopping.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Customer;
import onlineshopping.repository.CustomerRepository;
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;
	
	public List<Customer>getAllCustomerFormSpringData(){
		return cr.findAll();
	   }
	
	
	
	public String storeCustomerSpringData(Customer cc) {
		Optional<Customer>op=cr.findById(cc.getCustid());
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

	
	public String deleteCustomerSpringData(int custid) {
		
		 
		if(cr.existsById(custid)) {
			cr.deleteById(custid);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
		
	}
	
	
	public String updateCustomerSpringData(Customer cc) {

	     Optional<Customer> obj=cr.findById(cc.getCustid());
		   if(obj.isPresent()) {
			Customer c=obj.get();
			if(c!=null) {
			c.setCustname(cc.getCustname());
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
	

