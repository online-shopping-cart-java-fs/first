package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	private int cid;
	private String cname;
	private float cprice;
	private int caid;
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	
	public void setCaid(int caid) {
		this.caid = caid;
	}
	public int getCaid() {
		return caid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCprice(float cprice) {
		this.cprice = cprice;
	}
	public float getCprice() {
		return cprice;
	}
	
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", caid=" + caid + "]";
	}

}
