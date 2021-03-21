package onlineshopping.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private String username;
	private int accnum;
	private String custname;
	private String password;
	private String email;
	private String address;
	private String mobnum;
	
	public String getUsername() {
		return username;
	}
	public int getAccnum() {
		return accnum;
	}
	public String getCustname() {
		return custname;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getMobnum() {
		return mobnum;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}
	
	@Override
	public String toString() {
		return "Customer [username=" + username + ", accnum=" + accnum + ", custname=" + custname + ", password="
				+ password + ", email=" + email + ", address=" + address + ", mobnum=" + mobnum + "]";
	}
	
	
}
 
	
