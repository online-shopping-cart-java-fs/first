package onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Product;
import onlineshopping.dao.ProductRepository;

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
			return "Product is already present with this id";
		}else {
			Product p=productRepository.save(pp);
			if(p!=null) {
				return "Product Stored";
			}else {
				return "Product Didn't Store";
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
				return "Product Updated";
			}else {
				return "Product didn't update";
			}
		}else {
			return "Product is not present";
		}
	}
	
	public String deleteProduct(int Pid) {
		
		if(productRepository.existsById(Pid)) {
			productRepository.deleteById(Pid);
			return "Product deleted";
		}else {
			return "Product is not present";
		}
	}
}
