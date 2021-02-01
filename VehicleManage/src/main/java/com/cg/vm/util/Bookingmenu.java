package com.cg.vm.util;



import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.vm.bean.Booking;
import com.cg.vm.bean.Customer;
import com.cg.vm.dao.IBookingRepository;
import com.cg.vm.dao.IBookingRepositoryImpl;
import com.cg.vm.service.IBookingService;
import com.cg.vm.service.IBookingServiceImpl;

public class Bookingmenu extends VMSMainMenu {
	DBUtil dbutil = new DBUtil();
	   void bookingmenustart(){
		   System.out.println("Valid user");
			System.out.println("-----Booking Services------");
			System.out.println("1.Book your Vehice");
			System.out.println("2.Cancel Booking");
			System.out.println("3.Update Booking");
			System.out.println("4. View Booking");
			System.out.println("Enter your booking choice");
			int bookingchoice=scanner.nextInt();
			switch(bookingchoice) {
			case 1:{
				System.out.println("------Enter your booking details-------");
				Booking booking=new Booking();
				
			    LocalDate date= LocalDate.now();
			    System.out.println("Enter no. of days from now :");
			    int n=scanner.nextInt();
			    LocalDate bookingdate = date.plusDays(n);
			    System.out.println("Your booking from "+bookingdate);
			    
			    System.out.println("Enter for no. of Days :");
			    int days = scanner.nextInt();
			    System.out.println("Your booking till date");
	            LocalDate tilldate = date.plusDays(days);
	            System.out.println(tilldate);
	            System.out.println("Enter Booking Description :");
	            String s = null;
	            
	            System.out.println("Enter Vehicle type CAR/BUS");
	            String type = scanner.next();
	            s = type+"/";
	            System.out.println("Enter Vehicle type AC/NON-AC");
	            String category = scanner.next();
	            s=s+category+"/";
	            System.out.println("Enter Vehicle Capacity");
	            int capacity = scanner.nextInt();
	            String cap = String.valueOf(capacity);
	            s=s+cap;
	            /*if(booking.getVehicle().getType().equals(type) && booking.getVehicle().getCategory().equals(category) && booking.getVehicle().getCapacity().equals(capacity))
	            {
	            System.out.println(booking.getVehicle());	
	            }
	            else
	            {
	            	System.out.println("No Such Service available");
	            }*/
	            System.out.println("Enter the distance in KM");
	            double distance = scanner.nextDouble();
	            double costperday = distance*12;
	            System.out.println("Cost per km for the car is :"+12);
	            double totalCost = costperday * days; 
	            System.out.println("Total cost for "+days+" days " +totalCost);
	            booking.setBookingDate(date);
	            booking.setBookedTillDate(tilldate);
	            booking.setBookingDescription(s);
	            booking.setDistance(distance);
	            Customer customer = new Customer();
	            booking.setCustomer(customer);
	            IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.addBooking(booking);
			    break;
	            
			}
			case 2 :
			{   System.out.println("----Enter Booking ID to be deleted-----");
			    int customerid = scanner.nextInt();
				Booking booking = dbutil.entityManager.find(Booking.class,customerid);
					if(booking==null)
					{
					System.out.println("Customer detail not found");
					}
					else {	
		        IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.cancelBooking(booking);
					 }
					break;
			 }
			case 3 : 
			{
				System.out.println("----Enter Booking ID to be updated-----");
			    int customerId = scanner.nextInt();
				Booking booking =dbutil.entityManager.find(Booking.class, customerId);
					if(booking==null)
					{
					System.out.println("Customer detail not found");
					}
					else {	
		        IBookingService ibookingservice = new IBookingServiceImpl();
			    ibookingservice.updateBooking(booking);
			    break;
					 }
			}
			}
	   }
}
