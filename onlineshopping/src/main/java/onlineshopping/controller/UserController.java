package onlineshopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Address;
import onlineshopping.bean.Cart;
import onlineshopping.bean.Customer;
import onlineshopping.bean.CustomerOrders;
import onlineshopping.bean.Item;
import onlineshopping.bean.Orders;
import onlineshopping.bean.Product;
import onlineshopping.bean.ProductItem;
import onlineshopping.service.AddressService;
import onlineshopping.service.CartService;
import onlineshopping.service.CustomerOrdersService;
import onlineshopping.service.CustomerService;
import onlineshopping.service.ItemService;
import onlineshopping.service.OrderService;
import onlineshopping.service.ProductItemService;
import onlineshopping.service.ProductService;

@RestController
@RequestMapping(value="user")
@CrossOrigin
public class UserController {
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductItemService productItemService;
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	CustomerService cs;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CustomerOrdersService customerOrdersService;
	
	
	// dashboard related operations
	
	@GetMapping(value = "getAllItems",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	} 
	
	@GetMapping(value = "getProduct/{pid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Product> getProduct(@PathVariable("pid") int pid) {
		return productService.getProduct(pid);
	} 
		
		
	@GetMapping(value = "getAllProducts")
	public ResponseEntity<List<ProductItem>> getAllProducts(){
		List<ProductItem> productItemDetails = productItemService.getAllProducts();
		return ResponseEntity.status(200).body(productItemDetails);
	}
	
	@GetMapping(value = "getAllProductsByCategory/{itemid}")
	public ResponseEntity<List<ProductItem>> getAllProductsByCategory(@PathVariable("itemid") int itemid){
		List<ProductItem> productItemDetails = (List<ProductItem>) productItemService.getAllProductsByCategory(itemid);
		return ResponseEntity.status(200).body(productItemDetails);
	}
	
	@GetMapping(value = "getAllFromCart",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cart> getAllFromCart() {
		return cartService.getAllFromCart();
	} 
	
	@PostMapping(value = "storeToCart",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeToCart(@RequestBody Cart c) {
		return cartService.storeToCart(c);
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
	

	@PostMapping(value = "storeAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeAddressSpringData(@RequestBody Address aa) {
		return addressService.storeCreditCardSpringData(aa);
	}	
		
	@PutMapping(value = "updateAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateAddressSpringData(@RequestBody Address aa) {
		return addressService.updateAddressSpringData(aa);
	}
		
		
	@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateCustomerSpringData(@RequestBody Customer cc) {
		return cs.updateCustomerSpringData(cc);
	}
	
	@PutMapping(value = "updatePassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
	public String updatePassword(@RequestBody Customer cc) {
		return cs.updatePassword(cc);
	}
		
	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer cc) {
		return cs.storeCustomerSpringData(cc);
	}
	
	@DeleteMapping(value = "deleteCustomerData/{username}")
	public String deleteCustomerSpringData(@PathVariable("username") String username) {
			return cs.deleteCustomerSpringData(username);
	}
	
	@PostMapping(value = "storeOrderData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeOrderData(@RequestBody Orders o) {
		return orderService.storeOrder(o);
	}
	
	@GetMapping(value = "getAllOrdersByCustomer/{username}")
	public ResponseEntity<List<CustomerOrders>> getAllOrdersByCustomer(@PathVariable("username") String username){
		List<CustomerOrders> customerOrderDetails = (List<CustomerOrders>) customerOrdersService.getAllOrdersByCustomer(username);
		return ResponseEntity.status(200).body(customerOrderDetails);
	}
	
	@DeleteMapping(value= "deleteOrderData/{orderid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteOrderData(@PathVariable("orderid") int orderid ) {
		return orderService.deleteOrder(orderid);
	} 
		
}
