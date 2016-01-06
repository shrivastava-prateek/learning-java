package com.util;

import com.bean.Booking;
import com.bean.Customer;
import com.bean.HotelRoom;


public interface ReceptionManagerImpl 
{
	

	Booking book_myroom(HotelRoom h,Customer c);
	float billCalculation(int noRooms,int rate);

			

		

	

	

}
