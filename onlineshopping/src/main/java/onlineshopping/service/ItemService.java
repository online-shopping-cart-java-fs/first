package onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineshopping.bean.Item;
import onlineshopping.dao.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		
		return itemRepository.findAll();
	}
	
	public String storeItem(Item ii) {
		
		Optional<Item> op=itemRepository.findById(ii.getItemid());
		if(op.isPresent()) {
			return "Item already exists with this id";
		}else {
			Item i=itemRepository.save(ii);
			if(i!=null) {
				return "Item added successfully..";
			}else {
				return "Unable to add item";
			}
		}
	}
	
	public String updateItem(Item ii) {
		
		Optional<Item> op=itemRepository.findById(ii.getItemid());
		if(op.isPresent()) {
			Item i	 = op.get();
			if(i!=null) {
				i.setItemname(ii.getItemname());
				itemRepository.saveAndFlush(i);
				return "Item updated successfully..";
			}else {
				return "Unable to update item";
			}
		}else {
			return "Item not found";
		}
	}
	
	public String deleteItem(int itemid) {
		
		if(itemRepository.existsById(itemid)) {
			itemRepository.deleteById(itemid);
			return "Item deleted successfully..";
		}else {
			return "Item not found";
		}
	}
}
