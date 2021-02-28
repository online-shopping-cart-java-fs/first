package onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Item;
import onlineshopping.bean.Product;
import onlineshopping.service.ItemService;
import onlineshopping.service.ProductItemService;
import onlineshopping.service.ProductService;

@RestController
@RequestMapping(value="admin")
public class AdminController {

	@Autowired
	ProductService productService;
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	ProductItemService productItemService;
	
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
	
	@GetMapping(value = "getAllProducts",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	} 
	
	@GetMapping(value = "getAllProductsByCategory/{itemid}")
	public ResponseEntity<List<Object[]>> getAllProductsByCategory(@PathVariable("itemid") int itemid){
		List<Object[]> productItemDetails = productItemService.getAllProductsByCategory(itemid);
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
	
}
