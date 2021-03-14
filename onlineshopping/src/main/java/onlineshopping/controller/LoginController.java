package onlineshopping.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Customer;
import onlineshopping.bean.Product;
import onlineshopping.service.CustomerService;

@RestController
@RequestMapping(value="home")
@CrossOrigin
public class LoginController {
	
	@Autowired
	CustomerService customerService;

	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer cc) {
		return customerService.storeCustomerSpringData(cc);
	}
	
	@GetMapping(value = "getCustomer/{username}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Customer> getCustomer(@PathVariable("username") String username) {
		return customerService.getCustomer(username);
	} 
}
