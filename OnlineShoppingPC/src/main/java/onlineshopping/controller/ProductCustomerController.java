package onlineshopping.controller;

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


import onlineshopping.bean.ProductCustomer;
import onlineshopping.service.ProductCustomerService;

@RestController
@RequestMapping(value = "productCustomer")
public class ProductCustomerController {
	@Autowired
	ProductCustomerService productCustomerService;
	
			// http://localhost:9191/productCustomer/getProductCustomerData
			@GetMapping(value = "getProductCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
			public List<ProductCustomer> getAllDetailsFromSpringData(){
					return productCustomerService.getAllProductCustomerFromSpringData();
			}
			
			// http://localhost:9191/productCustomer/storeProductCustomerData
			@PostMapping(value = "storeProductCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
			public String storeProductCustomerSpringData(@RequestBody ProductCustomer pc) {
				return productCustomerService.storeProductCustomerSpringData(pc);
			}
			
			// http://localhost:9191/productCustomer/updateProductCustomerData
			@PutMapping(value = "updateProductCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
			public String updateProductCustomerSpringData(@RequestBody ProductCustomer pc) {
					return productCustomerService.updateProductCustomerSpringData(pc);
			}
			
			// http://localhost:9191/productCustomer/deleteProductCustomerData
			@DeleteMapping(value = "deleteProductCustomerData/{custId}")
			public String deleteProductCustomerSpringData(@PathVariable("custId") int custId) {
					return productCustomerService.deleteProductCustomerSpringData(custId);
			}
			

}
