package com.controller;

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

import com.service.CreditCardService;

import com.bean.CreditCard;

@RestController
@RequestMapping(value = "creditcard")
public class CreditCardController {
	
	@Autowired
	CreditCardService creditCardService;
	

	// http://localhost:9191/creditcard/getCreditCardData 
	@GetMapping(value = "getCreditCardData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CreditCard> getAllProductDetailsFromSpringData(){
			return creditCardService.getAllCreditCardFromSpringData();
	}
	
	// http://localhost:9191/creditcard/storeCreditCardData
	@PostMapping(value = "storeCreditCardData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody CreditCard cc) {
		return creditCardService.storeCreditCardSpringData(cc);
	}
	
	// http://localhost:9191/creditcard/updateCreditCardData
	@PutMapping(value = "updateCreditCardData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductSpringData(@RequestBody CreditCard cc) {
			return creditCardService.updateCreditCardSpringData(cc);
	}
	
	// http://localhost:9191/creditcard/deleteCreditCardData
	@DeleteMapping(value = "deleteCreditCardData/{creditCardNum}")
	public String deleteProductSpringData(@PathVariable("creditCardNum") int ccn) {
			return creditCardService.deleteCreditCardSpringData(ccn);
	}
	

	
	

}
