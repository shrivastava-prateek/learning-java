package com.bean;

public class HotelRoom {

	String hname;
	String location;
	Room_type rtype;
	int price;
	int total_rooms;
	int available_rooms;
	
	

	public HotelRoom(String hname, String location, Room_type rtype, int price) {
		super();
		this.hname = hname;
		this.location = location;
		this.rtype = rtype;
		this.price = price;
	}

	



	public HotelRoom() {
		super();
	}

	public void setTotal_rooms(int total_rooms)
	{
		this.total_rooms = total_rooms;
	}

	public int getTotal_rooms()
	{
		return total_rooms;
	}

	public void setAvailable_rooms(int available_rooms)
	{
		this.available_rooms = available_rooms;
	}

	public int getAvailable_rooms()
	{
		return available_rooms;
	}

	
	public String getHname() {
		return hname;
	}


	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Room_type getRtype() {
		return rtype;
	}

	public void setRtype(Room_type rtype) {
		this.rtype = rtype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Hotel [hname=" + hname + ", location=" + location + ", rtype="
				+ rtype + ", price=" + price + "]"+" , available rooms "+available_rooms;
	}
	
	
	
}
