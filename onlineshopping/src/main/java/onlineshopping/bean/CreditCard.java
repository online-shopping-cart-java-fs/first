package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class CreditCard {
	@Id
	private int creditCardNum;
	private int accNum;
	private int custId;
	private String password;
	private int debitCardNum;
	public int getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "CreditCard [creditCardNum=" + creditCardNum + ", accNum=" + accNum + ", custId=" + custId
				+ ", password=" + password + ", debitCardNum=" + debitCardNum + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDebitCardNum() {
		return debitCardNum;
	}
	public void setDebitCardNum(int debitCardNum) {
		this.debitCardNum = debitCardNum;
	}

}
