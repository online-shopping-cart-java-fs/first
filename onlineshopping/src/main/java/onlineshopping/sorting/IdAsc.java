package onlineshopping.sorting;

import java.util.Comparator;

import onlineshopping.bean.Product;

public class IdAsc implements Comparator<Product> {

	public int compare(Product p1,Product p2){  
		if(p1.getPid()==p2.getPid())  
		return 0;  
		else if(p1.getPid()>p2.getPid())  
		return 1;  
		else  
		return -1;  
		}  
}
