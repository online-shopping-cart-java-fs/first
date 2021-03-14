package onlineshopping.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Product;
import onlineshopping.bean.ProductItem;
import onlineshopping.dao.ProductItemDao;
import onlineshopping.sorting.PriceAsc;

@Service
public class ProductItemService {

	@Autowired
	ProductItemDao productItemDao;
	
	public List<ProductItem> getAllProductsByCategory(int itemid) {
		return productItemDao.getAllProductsByCategory(itemid);
	}
	
	public List<ProductItem> getAllProducts() {
		return productItemDao.getAllProducts();
	}
	
}
