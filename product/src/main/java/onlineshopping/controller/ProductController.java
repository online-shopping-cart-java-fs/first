package onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Product;
import onlineshopping.service.ProductService;

@RestController
@RequestMapping(value="product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "retrieveAllProducts",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> retrieveAllProduct() {
		return productService.getAllProducts();
	} 
		
	@PostMapping(value = "storeProductData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeProductData(@RequestBody Product p) {
		return productService.storeProduct(p);
	}
				
	@PutMapping(value= "updateProductData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String updateProductData(@RequestBody Product p) {
		return productService.updateProduct(p);	
	}
		
	@DeleteMapping(value= "deleteProductData/{Pid}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteItemData(@PathVariable("Pid") int Pid ) {
		return productService.deleteProduct(Pid);
	} 
}
