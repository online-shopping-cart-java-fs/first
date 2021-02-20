package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_customers")
public class ProductCustomer {
	private int pid;
	@Id
	private int custId;
	private int debitCardNum;
	private int creditCardNum;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
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
		return "ProductCustomer [pid=" + pid + ", custId=" + custId + ", debitCardNum=" + debitCardNum
				+ ", creditCardNum=" + creditCardNum + "]";
	}
	

}
