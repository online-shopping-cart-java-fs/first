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
import onlineshopping.bean.Customer;
import onlineshopping.bean.Item;
import onlineshopping.bean.Orders;
import onlineshopping.bean.Product;
import onlineshopping.bean.ProductItem;
import onlineshopping.service.AddressService;
import onlineshopping.service.CustomerService;
import onlineshopping.service.ItemService;
import onlineshopping.service.JoinService;
import onlineshopping.service.OrderService;
import onlineshopping.service.ProductItemService;
import onlineshopping.service.ProductService;

@RestController
@RequestMapping(value="admin")
@CrossOrigin
public class AdminController {

	@Autowired
	ProductService productService;
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ProductItemService productItemService;
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	JoinService js;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	OrderService os;
	
	
	//dashboard related operations
	
	@GetMapping(value = "getAllItems",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	} 
		
	@PostMapping(value = "storeItemData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeItemData(@RequestBody Item i) {
		return itemService.storeItem(i);
	}
				
	@PutMapping(value= "updateItemData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String updateItemData(@RequestBody Item i) {
		return itemService.updateItem(i);	
	}
		
	@DeleteMapping(value= "deleteItemData/{itemid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteItemData(@PathVariable("itemid") int itemid ) {
		return itemService.deleteItem(itemid);
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
		
	@PostMapping(value = "storeProductData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeProductData(@RequestBody Product p) {
		return productService.storeProduct(p);
	}
				
	@PutMapping(value= "updateProductData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String updateProductData(@RequestBody Product p) {
		return productService.updateProduct(p);	
	}
		
	@DeleteMapping(value= "deleteProductData/{pid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteProductData(@PathVariable("pid") int pid ) {
		return productService.deleteProduct(pid);
	}
	
	
	/*@GetMapping(value = "getAllCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomerDetailsFromSpringData(){
			return customerService.g
	}
	
	@GetMapping(value = "getCustomerDataByUsername/{username}")
	public Customer getCustomerSpringData(@PathVariable("username") String username) {
			return cs.getCustomerSpringDataById(username);
	} */
	
	@GetMapping(value = "addressinfo/{username}")
	public ResponseEntity<List<Object[]>> getCustomerAddressInfo(@PathVariable("username") String username){
					List<Object[]> details = js.getCustomerAddressDetails(username);
					return ResponseEntity.status(200).body(details);
					
	}
	@DeleteMapping(value = "deleteAddressData/{addId}")
	public String deleteAddressSpringData(@PathVariable("addId") int aid) {
			return addressService.deleteAddressSpringData(aid);
	}
	
	@GetMapping(value = "getAllOrders",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getAllOrdersDetails() {
		return os.getOrderDetailsFromSpringData();
	} 
	
	
	@GetMapping(value = "ordersinfo/{username}")
	public ResponseEntity<List<Object[]>> getCustomerOrdersInfo(@PathVariable("username") String username){
					List<Object[]> details = js.getCustomerOrdersDetails(username);
				
					return ResponseEntity.status(200).body(details);
					
	}
	
	
	

	

	
}
