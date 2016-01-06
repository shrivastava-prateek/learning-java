package com.bean;

public class Booking {
	int booking_id;
	float bill;
	
	
	//Status status;
	//int commision;
	//Hotel h;
	public Booking(int booking_id,float bill) {
		super();
		this.booking_id = booking_id;
		//this.status = status;
		// this.commision = commision;
		this.bill=bill;
	}
	public int getBooking_id() {
		return booking_id;
	}
	
	public float getBill() {
		return bill;
	}
	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", bill=" + bill + "]";
	}
	
	
	

}
