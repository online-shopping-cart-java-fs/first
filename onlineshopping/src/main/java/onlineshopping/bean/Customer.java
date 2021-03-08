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
 
 private String email;
 private long mobileno;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "Customer [username=" + username + ", accnum=" + accnum + ", custname=" + custname + ", password=" + password
			+ ", email=" + email + ", mobileno=" + mobileno + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
 }
