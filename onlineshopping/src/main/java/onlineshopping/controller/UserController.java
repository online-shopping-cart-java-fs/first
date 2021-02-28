package onlineshopping.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Cart;
import onlineshopping.bean.Item;
import onlineshopping.bean.Product;
import onlineshopping.service.CartService;
import onlineshopping.service.ItemService;
import onlineshopping.service.ProductItemService;
import onlineshopping.service.ProductService;

@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductItemService productItemService;
	
	// dashboard related operations
	
	@GetMapping(value = "getAllItems",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	} 
		
	@GetMapping(value = "getAllProducts",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	} 
	
	@GetMapping(value = "getAllProductsByCategory/{itemid}")
	public ResponseEntity<List<Object[]>> getAllProductsByCategory(@PathVariable("itemid") int itemid){
		List<Object[]> productItemDetails = productItemService.getAllProductsByCategory(itemid);
		return ResponseEntity.status(200).body(productItemDetails);
	}
	
	@GetMapping(value = "getAllFromCart",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cart> getAllFromCart() {
		return cartService.getAllFromCart();
	} 
	
	@PostMapping(value= "storeToCart/{pid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeToCart(@PathVariable("pid") int pid ) {
		return cartService.storeToCart(pid);
	} 
	
	@DeleteMapping(value= "deleteFromCart/{cid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteFromCart(@PathVariable("cid") int cid ) {
		return cartService.deleteFromCart(cid);
	} 
	
	@GetMapping(value = "getAllProductsByPriceAscOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByPriceAscOrder() {
		return productService.getAllProductsSortByPriceAscOrder();
	} 
	
	@GetMapping(value = "getAllProductsByPriceDescOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByPriceDescOrder() {
		return productService.getAllProductsSortByPriceDescOrder();
	} 
	
	@GetMapping(value = "getAllProductsByNameAscOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByNameAscOrder() {
		return productService.getAllProductsSortByNameAscOrder();
	} 
	
	@GetMapping(value = "getAllProductsByNameDescOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByNameDescOrder() {
		return productService.getAllProductsSortByNameDescOrder();
	} 
	
	@GetMapping(value = "getAllProductsByIdAscOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByIdAscOrder() {
		return productService.getAllProductsSortByIdAscOrder();
	} 
	
	@GetMapping(value = "getAllProductsByIdDescOrder",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductsByIdDescOrder() {
		return productService.getAllProductsSortByIdDescOrder();
	} 
}
