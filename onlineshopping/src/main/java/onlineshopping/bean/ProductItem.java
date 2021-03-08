package onlineshopping.bean;

public class ProductItem {
	
	private int pid;
	private String pname;
	private float price;
	private String itemname;
	
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public float getPrice() {
		return price;
	}
	public String getItemname() {
		return itemname;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

}
