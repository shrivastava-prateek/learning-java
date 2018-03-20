package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Booking;
import com.bean.Customer;
import com.bean.HotelRoom;
import com.bean.Room_type;
import com.bean.Status;
import com.exceptions.*;

public class VerificationOfficerImpl  implements ReceptionManagerImpl
{
	Booking b;
	Status s;
	static int id=0;
	float commision;

	public List<HotelRoom> search_myroom(int budget, int norooms, int noadults) throws MoreThanMaxAdults, LowBudgetException, TooManyRoomsException
	{
		List<HotelRoom> return_list =new ArrayList<HotelRoom>();

		HolidaySpotAdminImpl  hs= new HolidaySpotAdminImpl();
    	List<HotelRoom> list=hs.populatedata();
    	int maxAR = 0,minbudget=0;int flag=0;
    	for (HotelRoom h:list)
    	{
    		if(flag==0)
    		{
    			flag=1;
    			minbudget=h.getPrice();
    		}
    		if(h.getAvailable_rooms()>maxAR)
    		{
    			maxAR=h.getAvailable_rooms();
    		}
    		if(h.getPrice()<minbudget)
    		{
    			minbudget=h.getPrice();
    		}
    		
    		if (h.getPrice() <= budget && h.getAvailable_rooms() >= norooms)
			{
				if(noadults<=3*norooms){
				return_list.add(h);
				}
				else{
					throw new MoreThanMaxAdults();
				}
			}
		}
		if (return_list.size() == 0)
		{
			if(budget<minbudget)
			{
				throw new LowBudgetException();
			}
			else
			{
				throw new TooManyRoomsException();
			}
			
			
    	}
		return return_list;
	}
	public void setStatus(Status st)
	{
	    this.s = st;
	}

	@Override
	public Booking book_myroom(HotelRoom h, Customer c)
	{
	    setStatus(Status.In_Process);
	    System.out.println(s);
		Connection conn=null;
		PreparedStatement st=null;
		DBConnection db= new DBConnection();
		conn = db.getConnection();
		int noRooms=c.getNoRooms();
		int new_available_rooms=(h.getAvailable_rooms()) - noRooms;
		System.out.println(new_available_rooms);
		int i;        
		try
		{
			st = conn.prepareStatement("update hotel_table set available_rooms=? where name=? and room_type=? ");
			st.setInt(1, new_available_rooms);
			st.setString(2, h.getHname());
			st.setString(3, h.getRtype().toString());
			i = st.executeUpdate();

		}
		catch (SQLException e)
		{
			System.out.println("Exception" + e);
		}

	    setStatus(Status.Closed);
	    System.out.println(s);
	    int rate=h.getPrice();
	    float bill=billCalculation(noRooms, rate);
	    b = new Booking(++id, bill);

		return b;
	}

	public Status check_status() 
	{
		// TODO Auto-generated method stub
		return this.s;
	}

	public Booking getB()
	{
		return b;
	}

	@Override
	public float billCalculation(int noRooms, int rate)
	{
		// TODO Auto-generated method stub

		return noRooms * rate;
	}



	/*
	 * 

	 List<Hotel> return_list =new ArrayList<Hotel>();
	 // TODO Auto-generated method stub

	 if(noadults>3&&noadults<0)
	 {
	 throw new MoreThanMaxAdults();

	 }

	 HolidaySpotAdminImpl  hs= new HolidaySpotAdminImpl();
	 List<Hotel> list=hs.populatedata();
	 for(Hotel h:list)
	 {

	 if(h.getRtype().equals(Room_type.valueOf(roomtype))&&h.getRtype().getAvailable_rooms()>norooms)
	 {

	 //System.out.println(h.getRtype());
	 return_list.add(h);

	 }
	 }

	 return return_list;

	 */
}
