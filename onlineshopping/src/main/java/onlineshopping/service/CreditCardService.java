package onlineshopping.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.CreditCard;

import onlineshopping.dao.CreditCardRepository;
@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository creditCardRepository;

	public List<CreditCard> getAllCreditCardFromSpringData() {
		return creditCardRepository.findAll();
	}

	public String storeCreditCardSpringData(CreditCard cc) 
	{
		Optional<CreditCard> op = creditCardRepository.findById(cc.getCreditCardNum());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			CreditCard c = creditCardRepository.save(cc);			// save the records 
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}

	public String updateCreditCardSpringData(CreditCard cc) 
	{
		Optional<CreditCard> obj = creditCardRepository.findById(cc.getCreditCardNum());
		if(obj.isPresent()) 
		{
			CreditCard c	 = obj.get();
			c.setDebitCardNum(cc.getDebitCardNum());
			c.setPassword(cc.getPassword());
		creditCardRepository.saveAndFlush(c);
		return "Record updated successfully";
		}
		else 
		{
			return "Record not present";
		}
	}
	

	public String deleteCreditCardSpringData(int ccn) {
		if(creditCardRepository.existsById(ccn))
		{
			creditCardRepository.deleteById(ccn);
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}

	


}
