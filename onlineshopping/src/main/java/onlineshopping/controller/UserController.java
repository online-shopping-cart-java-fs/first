package onlineshopping.controller;

import java.util.List;



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
import onlineshopping.bean.CreditCard;
import onlineshopping.bean.Customer;
import onlineshopping.bean.Item;
import onlineshopping.bean.Orders;
import onlineshopping.bean.Product;
import onlineshopping.service.AddressService;
import onlineshopping.service.CartService;
import onlineshopping.service.CreditCardService;
import onlineshopping.service.CustomerService;
import onlineshopping.service.ItemService;
import onlineshopping.service.JoinService;
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
	CreditCardService creditCardService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	JoinService ccs;
	
	
	
	
	
	
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
	

		@PostMapping(value = "storeAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeAddressSpringData(@RequestBody Address aa) {
			return addressService.storeCreditCardSpringData(aa);
				}
		
		
		@PutMapping(value = "updateAddressData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateAddressSpringData(@RequestBody Address aa) {
			return addressService.updateAddressSpringData(aa);
				}
		
		
		@DeleteMapping(value = "deleteAddressData/{addId}")
		public String deleteProductSpringData(@PathVariable("addId") int aid) {
				return addressService.deleteAddressSpringData(aid);
		}
		
		@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateCustomerSpringData(@RequestBody Customer cc) {
				return cs.updateCustomerSpringData(cc);
		}
		
		@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeCustomerSpringData(@RequestBody Customer cc) {
			return cs.storeCustomerSpringData(cc);
		}
		
		
		

		
		@GetMapping(value = "getCreditCardData",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<CreditCard> getAllProductDetailsFromSpringData(){
				return creditCardService.getAllCreditCardFromSpringData();
		}
		
		
		
		@PostMapping(value = "storeCreditCardData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeProductSpringData(@RequestBody CreditCard cc) {
			return creditCardService.storeCreditCardSpringData(cc);
		}
		
		
		@PutMapping(value = "updateCreditCardData",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProductSpringData(@RequestBody CreditCard cc) {
				return creditCardService.updateCreditCardSpringData(cc);
		}
		
		
		@DeleteMapping(value = "deleteCreditCardData/{creditCardNum}")
		public String deleteCreditcardSpringData(@PathVariable("creditCardNum") int ccn) {
				return creditCardService.deleteCreditCardSpringData(ccn);
		}
		
		@GetMapping(value = "getorderinfo/{custid}")
		public ResponseEntity<List<Object[]>> getCustomerOrderInfo(@PathVariable("custid") int custid){
				List<Object[]> details = ccs.getOrdersDetails(custid);
				return ResponseEntity.status(200).body(details);
		}
						
		
		@PostMapping(value = "storeOrderInfo",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeOrderSpringData(@RequestBody Orders aa) {
			return orderService.storeOrderSpringData(aa);
		}
				
		
		@PutMapping(value = "updateOrderInfo",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateAddressSpringData(@RequestBody Orders aa) {
			return orderService.updateOrderSpringData(aa);
		}
				
		
		@DeleteMapping(value = "deleteOrderInfo/{orderid}")
		public String deleteOrderSpringData(@PathVariable("orderid") int oid) {
			return orderService.deleteOrderSpringData(oid);
		}
				

		

		
}
