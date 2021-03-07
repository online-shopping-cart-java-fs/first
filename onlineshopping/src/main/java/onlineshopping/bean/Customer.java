package onlineshopping.bean;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Customer {
 @Id
 private String username;
 private int accnum;
 private String custname;
 private String password;
 
 private String address;
 private long mobileno;
public String getUsername() {
	return username;
}
@Override
public String toString() {
	return "Customer [username=" + username + ", accnum=" + accnum + ", custname=" + custname + ", password=" + password
			+  ", address=" + address + ", mobileno=" + mobileno + "]";
}
public void setUsername(String username) {
	this.username = username;
}
public int getAccnum() {
	return accnum;
}
public void setAccnum(int accnum) {
	this.accnum = accnum;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
 }
