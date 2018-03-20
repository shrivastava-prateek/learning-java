package com.psl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bean.Booking;
import com.bean.Credit_Card_Details;
import com.bean.Customer;
import com.bean.HotelRoom;
import com.bean.Room_type;
import com.bean.Status;
import com.exceptions.LowBudgetException;
import com.exceptions.MoreThanMaxAdults;
import com.exceptions.TooManyRoomsException;
import com.util.HolidaySpotAdminImpl;
import com.util.VerificationOfficerImpl;
import com.exceptions.*;

public class Client
{
	public static void main(String args[])
	{
		HolidaySpotAdminImpl hs = new HolidaySpotAdminImpl();
        VerificationOfficerImpl voi = new VerificationOfficerImpl();
		List<HotelRoom> eligible_hotels = new ArrayList<HotelRoom>();
      
		int noRooms;
		System.out.print("Enter no. of adults : ");
		Scanner s = new Scanner(System.in);
		int noAdults = s.nextInt();
		voi.setStatus(Status.In_Progress);
		System.out.println();
		
	    System.out.println(voi.check_status());

		while (true)
		{
			try
			{
				System.out.print("Enter no. of rooms : ");
				noRooms = s.nextInt();
				System.out.print("Enter your budget : ");
				int budget=s.nextInt();
				eligible_hotels = voi.search_myroom(budget, noRooms, noAdults);
				break;
			}
			catch (MoreThanMaxAdults e)
			{
				System.out.println("can not accomodate more than 3 adults in a room , please add more rooms");
				continue;
				
			} catch (LowBudgetException e1) {
				System.out.println("Increase your budget this time");
				continue;
			} catch (TooManyRoomsException e1) {
				System.out.println("Enter less number of rooms this time");
				continue;
			}
		}
		System.out.println("---------------Eligible Hotels------------------");

		for (HotelRoom e : eligible_hotels)
		{ 
		   System.out.println(e);
		}
		s.nextLine();
        System.out.print("Select a Hotel :");
		String selectedhotel = s.nextLine();
		System.out.println(selectedhotel);
		System.out.println("Select its room type");
		String room_type =s.nextLine();
		voi.setStatus(Status.Waiting_For_User_Updates);
		System.out.println();
		Room_type rt=Room_type.valueOf(room_type);
		
		System.out.println(voi.check_status());
		HotelRoom h1 = null;
		for (HotelRoom h : eligible_hotels)
		{
			if (h.getHname().equalsIgnoreCase(selectedhotel) && h.getRtype().equals(rt))
			{
				System.out.println(h.getHname());
				h1 = h;
				break;
			}
		}
		System.out.print("Do you finally want to book a room: press 1 for yes or 0 for no : ");
		int inp=s.nextInt();
		System.out.println();
		
		if (inp == 1)
		{

			Credit_Card_Details cd = new Credit_Card_Details(1000000, "HDFC", 404);
			Customer c = new Customer("Prateek", cd, 1234567890,
									  "prateek.in@gmail.com", "186,opp workshop,nagpur", noRooms);
			voi.setStatus(Status.Forwarded);
			Booking booking = voi.book_myroom(h1, c);

			System.out.println("Your Room is booked");
			System.out.println("Your details are :" + c);
			System.out.println("Your Booking details are :" + booking);
			System.out.println("Your Room Type: " + room_type + " No. of Rooms : "
							   + noRooms + " No. of Adults : " + noAdults);
			System.out.println("The commission of HolidaySpot agency is: "
							   + hs.calculateCommision(voi));
		}
		System.out.println("Thank you. Visit us again");

	}
}
