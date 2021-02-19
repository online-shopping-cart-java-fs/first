package onlineshopping.bean;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Customer {
 @Id
 private int custid;
 private int accnum;
 
 private String custname;
 private String password;
 private int debitnum;
public int getAccnum() {
	return accnum;
}
public void setAccnum(int accnum) {
	this.accnum = accnum;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getDebitnum() {
	return debitnum;
}
public void setDebitnum(int debitnum) {
	this.debitnum = debitnum;
}
@Override
public String toString() {
	return "Customer [accnum=" + accnum + ", custid=" + custid + ", custname=" + custname + ", password=" + password
			+ ", debitnum=" + debitnum + "]";
}
 
}
