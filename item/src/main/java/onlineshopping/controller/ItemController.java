package onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onlineshopping.bean.Item;
import onlineshopping.service.ItemService;

@RestController
@RequestMapping(value="item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping(value = "retrieveAllItems",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> retrieveAllItems() {
		return itemService.getAllItems();
	} 
		
	@PostMapping(value = "storeItemData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String storeItemData(@RequestBody Item i) {
		return itemService.storeItem(i);
	}
				
	@PostMapping(value= "updateItemData",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String updateItemData(@RequestBody Item i) {
		return itemService.updateItem(i);	
	}
		
	@DeleteMapping(value= "deleteItemData/{id}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteItemData(@PathVariable("id") int id ) {
		return itemService.deleteItem(id);
	} 
}
