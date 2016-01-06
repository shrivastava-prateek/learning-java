package com.bean;

public class Customer {
	String name;
    Credit_Card_Details ccd;
    int mobile;
    String email;
    String address;
	int noRooms;
    //Booking booking;
    
	
	
    public Customer(String name, Credit_Card_Details ccd, int mobile,
			String email, String address,int noRooms) {
		super();
		this.name = name;
		this.ccd = ccd;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.noRooms=noRooms;
		//this.booking = booking;
	}
    public int getNoRooms() {
		return noRooms;
	}
    
    @Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile
				+ ", email=" + email + ", address=" + address + "]";
	}
   
    
}
