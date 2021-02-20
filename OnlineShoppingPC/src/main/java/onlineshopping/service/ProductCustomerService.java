package onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import onlineshopping.bean.ProductCustomer;
import onlineshopping.dao.ProductCustomerRepository;
@Service
public class ProductCustomerService {
	@Autowired
	ProductCustomerRepository productCustomerRepository;

	public List<ProductCustomer> getAllProductCustomerFromSpringData() {
		return productCustomerRepository.findAll();
	}

	public String storeProductCustomerSpringData(ProductCustomer pc) {
		Optional<ProductCustomer> op = productCustomerRepository.findById(pc.getCustId());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			ProductCustomer c = productCustomerRepository.save(pc);			// save the records 
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}

	public String updateProductCustomerSpringData(ProductCustomer pc) {
		Optional<ProductCustomer> obj = productCustomerRepository.findById(pc.getCustId());
		if(obj.isPresent()) 
		{
			ProductCustomer c	 = obj.get();
			c.setDebitCardNum(pc.getDebitCardNum());
			c.setCreditCardNum(pc.getCreditCardNum());
		productCustomerRepository.saveAndFlush(c);
		return "Record updated successfully";
		}
		else 
		{
			return "Record not present";
		}
	}

	public String deleteProductCustomerSpringData(int custId) {
		if(productCustomerRepository.existsById(custId))
		{
			productCustomerRepository.deleteById(custId);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}

}
