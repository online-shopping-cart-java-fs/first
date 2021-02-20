package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private int itemid;
	private float price;
	
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getItemid() {
		return itemid;
	}
	public float getPrice() {
		return price;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", itemid=" + itemid + ", price=" + price + "]";
	}
	
	
}
