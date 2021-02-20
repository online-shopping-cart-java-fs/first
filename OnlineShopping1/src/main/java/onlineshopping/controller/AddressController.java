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

import onlineshopping.bean.Address;

import onlineshopping.service.AddressService;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	@Autowired
	AddressService addressService;
	

	// http://localhost:9191/address/getAddressData 
	@GetMapping(value = "getAddressData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Address> getAddressDetailsFromSpringData(){
			return addressService.getAddressDetailsFromSpringData();
	}
	
	// http://localhost:9191/address/storeAddressData
	@PostMapping(value = "storeAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeAddressSpringData(@RequestBody Address aa) {
		return addressService.storeCreditCardSpringData(aa);
			}
	
	// http://localhost:9191/address/updateAddressData
	@PutMapping(value = "updateAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAddressSpringData(@RequestBody Address aa) {
		return addressService.updateAddressSpringData(aa);
			}
	
	// http://localhost:9191/address/deleteAddressData
	@DeleteMapping(value = "deleteAddressData/{addId}")
	public String deleteProductSpringData(@PathVariable("addId") int aid) {
			return addressService.deleteAddressSpringData(aid);
	}
	

	

}
