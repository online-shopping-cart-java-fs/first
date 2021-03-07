package onlineshopping.sorting;

import java.util.Comparator;

import onlineshopping.bean.Product;

public class NameDesc implements Comparator<Product>{

	public int compare(Product p1,Product p2){  
		return p2.getPname().compareTo(p1.getPname());
		} 
}
