package onlineshopping.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Product;
import onlineshopping.dao.ProductRepository;
import onlineshopping.sorting.IdAsc;
import onlineshopping.sorting.IdDesc;
import onlineshopping.sorting.NameAsc;
import onlineshopping.sorting.NameDesc;
import onlineshopping.sorting.PriceAsc;
import onlineshopping.sorting.PriceDesc;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}
	
	public String storeProduct(Product pp) {
		
		Optional<Product> op=productRepository.findById(pp.getPid());
		if(op.isPresent()) {
			return "Product already exists with this id";
		}else {
			try {
				Product p=productRepository.save(pp);
				if(p!=null) {
					return "Product Added Successfully..";
				}else {
					return "Unable to add product";
				}
			}catch(Exception e) {
				return "No category exists for this product";
			}
		}
	}
	
	public String updateProduct(Product pp) {
		
		Optional<Product> op=productRepository.findById(pp.getPid());
		if(op.isPresent()) {
			Product p=op.get();
			if(p!=null) {
				p.setPrice(pp.getPrice());
				productRepository.saveAndFlush(p);
				return "Product updated successfully..";
			}else {
				return "Unable to update product";
			}
		}else {
			return "Product not found";
		}
	}
	
	public String deleteProduct(int pid) {
		
		if(productRepository.existsById(pid)) {
			productRepository.deleteById(pid);
			return "Product deleted successfully..";
		}else {
			return "Product not found";
		}
	}
	
	public List<Product> getAllProductsSortByPriceAscOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new PriceAsc());
		return listOfProd;
	}
	
	public List<Product> getAllProductsSortByPriceDescOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new PriceDesc());
		return listOfProd;
	}
	
	public List<Product> getAllProductsSortByNameAscOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new NameAsc());
		return listOfProd;
	}
	
	public List<Product> getAllProductsSortByNameDescOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new NameDesc());
		return listOfProd;
	}
	
	public List<Product> getAllProductsSortByIdAscOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new IdAsc());
		return listOfProd;
	}
	
	public List<Product> getAllProductsSortByIdDescOrder() {
		
		ArrayList<Product> listOfProd=new ArrayList<Product>();
		listOfProd=(ArrayList<Product>) productRepository.findAll();
		Collections.sort(listOfProd,new IdDesc());
		return listOfProd;
	}
}
