package onlineshopping.controller;

import java.util.ArrayList;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import onlineshopping.bean.Customer;
import onlineshopping.service.CustomerService;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	
	
	@GetMapping(value = "getAllCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomerDetailsFromSpringData(){
			return cs.getAllCustomerFormSpringData();
	}
	
	
	@GetMapping(value = "getCustomerData/{custid}")
	public List<Customer> getCustomerSpringData(@PathVariable("custid") int custid) {
			return cs.getCustomerSpringData(custid);
	}
	
	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer cc) {
		return cs.storeCustomerSpringData(cc);
	}
	
	

	
	@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomerSpringData(@RequestBody Customer cc) {
			return cs.updateCustomerSpringData(cc);
	}
	
	


	@DeleteMapping(value = "deleteCustomerData/{custid}")
	public String deleteCustomerSpringData(@PathVariable("custid") int custid) {
			return cs.deleteCustomerSpringData(custid);
	}
	
	

}
