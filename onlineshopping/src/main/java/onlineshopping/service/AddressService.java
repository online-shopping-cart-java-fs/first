package onlineshopping.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Address;

import onlineshopping.dao.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> getAddressDetailsFromSpringData() {
		
		return addressRepository.findAll();
	}
	

	public String storeCreditCardSpringData(Address aa) {
		Optional<Address> op = addressRepository.findById(aa.getAddid());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Address c = addressRepository.save(aa);			// save the records 
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}

	public String updateAddressSpringData(Address aa) {
		Optional<Address> obj = addressRepository.findById(aa.getAddid());
		if(obj.isPresent()) 
		{
			Address c	 = obj.get();
			c.setStreetname(aa.getStreetname());
			c.setCity(aa.getCity());
			c.setState(aa.getState());
			c.setPin(aa.getPin());
			
		addressRepository.saveAndFlush(aa);
		return "Record updated successfully";
		}
		else 
		{
			return "Record not present";
		}
	}

	public String deleteAddressSpringData(int aid) {
		if(addressRepository.existsById(aid))
		{
			addressRepository.deleteById(aid);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}

	

	
}
