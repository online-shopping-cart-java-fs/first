package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_customers")
public class ProductCustomer {
	private int pid;
	@Id
	private String username;
	private int debitCardNum;
	private int creditCardNum;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getDebitCardNum() {
		return debitCardNum;
	}
	public void setDebitCardNum(int debitCardNum) {
		this.debitCardNum = debitCardNum;
	}
	public int getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	@Override
	public String toString() {
		return "ProductCustomer [pid=" + pid + ", username=" + username + ", debitCardNum=" + debitCardNum
				+ ", creditCardNum=" + creditCardNum + "]";
	}
	
}
