package onlineshopping.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	private int orderid;
	private String ordername;
	private String coid;
	private float total;
	
	public int getOrderid() {
		return orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public String getCoid() {
		return coid;
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
	public void setCoid(String coid) {
		this.coid = coid;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
	
	

}
