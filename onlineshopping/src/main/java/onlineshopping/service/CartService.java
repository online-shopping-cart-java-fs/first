package onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Cart;
import onlineshopping.bean.Item;
import onlineshopping.bean.Product;
import onlineshopping.dao.CartRepository;
import onlineshopping.dao.ProductRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Cart> getAllFromCart() {
		
		return cartRepository.findAll();
	}
	
	public String storeToCart(Cart cc) {
		
		Optional<Cart> op=cartRepository.findById(cc.getCid());
		if(op.isPresent()) {
			return "Already Added";
		}else {
			Cart c=cartRepository.save(cc);
			if(c!=null) {
				return "Added to cart";
			}else {
				return "Unable to add";
			}
		}
		
	}
	
	public String deleteFromCart(int cid) {
		
		if(cartRepository.existsById(cid)) {
			cartRepository.deleteById(cid);
			return "Deleted";
		}else {
			return "Unable to delete";
		}
	}

}
