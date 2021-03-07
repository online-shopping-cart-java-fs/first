package onlineshopping.sorting;

import java.util.Comparator;

import onlineshopping.bean.Product;

public class NameAsc implements Comparator<Product>{

	public int compare(Product p1,Product p2){  
		return p1.getPname().compareTo(p2.getPname());
		}  
}
