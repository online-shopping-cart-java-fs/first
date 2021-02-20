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
			return "Item is already present with this id";
		}else {
			Item i=itemRepository.save(ii);
			if(i!=null) {
				return "Item Stored";
			}else {
				return "Item Didn't Store";
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
				return "Item Updated";
			}else {
				return "Item didn't update";
			}
		}else {
			return "Item is not present";
		}
	}
	
	public String deleteItem(int id) {
		
		Optional<Item> op=itemRepository.findById(id);
		if(op.isPresent()) {
			itemRepository.deleteById(id);
			return "Item Deleted";
		}else {
			return "Item is not present";
		}
	}
}
