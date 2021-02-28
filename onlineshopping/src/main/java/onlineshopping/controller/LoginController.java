package onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Customer;
import onlineshopping.service.CustomerService;

@RestController
@RequestMapping(value="home")
public class LoginController {
	
	@Autowired
	CustomerService cs;

	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer cc) {
		return cs.storeCustomerSpringData(cc);
	}
}
