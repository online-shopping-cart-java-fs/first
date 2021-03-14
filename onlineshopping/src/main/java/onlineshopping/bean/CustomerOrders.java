package onlineshopping.bean;

public class CustomerOrders {
	
	private int orderid;
	private String ordername;
	private String username;
	private String email;
	//private long mobnum;
	private String address;
	private float total;
	
	public int getOrderid() {
		return orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	/*public long getMobnum() {
		return mobnum;
	} */
	public String getAddress() {
		return address;
	}
	public float getTotal() {
		return total;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	} */
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	

}
