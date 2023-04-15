package ioSerializable;

import java.io.Serializable;

public class Account implements Serializable{
	String address;
	String name;
	int id ;
	double balance;
	public Account(String address, String name, int id, double balance) {
		super();
		this.address = address;
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [address=" + address + ", name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
	
}
