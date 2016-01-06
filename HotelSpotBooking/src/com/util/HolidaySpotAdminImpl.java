package com.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.Booking;
import com.bean.Customer;
import com.bean.HotelRoom;
import com.bean.Room_type;

public class HolidaySpotAdminImpl
{
	
	public float calculateCommision(VerificationOfficerImpl voi)
	{
		float comm=0.1f*((float)voi.getB().getBill());
		return comm;
	}

	
 	public List<HotelRoom> populatedata()
	{
		DBConnection dbc= new DBConnection();
		Connection conn=dbc.getConnection();
		List<HotelRoom> hotellist= new ArrayList<HotelRoom>();
		
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from hotel_table");
			while(rs.next())
			{
				Room_type rt=Room_type.valueOf(rs.getString("room_type"));
				HotelRoom h= new HotelRoom(rs.getString("name"), rs.getString("location"), rt, rs.getInt("price"));
				h.setAvailable_rooms(rs.getInt("available_rooms"));
				h.setTotal_rooms(rs.getInt("total_rooms"));
				hotellist.add(h);
			}
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try {
			if(!conn.isClosed()){
			dbc.closeConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotellist;
		
	}

}
