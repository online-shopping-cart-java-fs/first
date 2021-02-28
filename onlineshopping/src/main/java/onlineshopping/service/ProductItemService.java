package onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.dao.ProductItemDao;

@Service
public class ProductItemService {

	@Autowired
	ProductItemDao productItemDao;
	
	public List<Object[]> getAllProductsByCategory(int itemid) {
		return productItemDao.getAllProductsByCategory(itemid);
	}
	
}
