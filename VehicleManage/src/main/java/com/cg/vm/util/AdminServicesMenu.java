package com.cg.vm.util;

import java.util.Scanner;

import com.cg.vm.bean.User;
import com.cg.vm.service.ICustomerService;
import com.cg.vm.service.ICustomerServiceImpl;
import com.cg.vm.service.IUserService;
import com.cg.vm.service.IUserServiceImpl;

public class AdminServicesMenu {
	
	 ICustomerService iCustomerService;
	
	 AdminServicesMenu (){
		iCustomerService=new ICustomerServiceImpl();
		
	}
	

	public  void adminmenustart() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your username");
		String adminusr=sc.next();
		System.out.println("Enter Your password");
		
		String adminpwd=sc.next();
		 String continueChoice;
		//admin menu
		do {
			if(adminusr.equals("admin")&&adminpwd.equals("admin")) {
				System.out.println("1.View all Customers");
				System.out.println("2.view all bookings");
				System.out.println("3.Add/Modify Vehicles");
				System.out.println("4.Add/Modify Driver");
				System.out.println("5.Approve/Reject Vehicles to customer");
				System.out.println("6.View all Vehicles");
				System.out.println("7.List of Vehicles Rented");
				System.out.println("8.Customer Payment Details");
				System.out.println("0.Logout");
				
				
				
				int adminChoice=sc.nextInt();
				switch(adminChoice) {
				case 1:
					System.out.print("List of Customers");
					iCustomerService.viewAllCustomer();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
					
				case 0:
					IUserService logoutOperation = new IUserServiceImpl();
					User user = new User();
					logoutOperation.signOut(user);
				default :
					System.out.print("Wrong choice\n ");
				
				}
				
				
			}
			else
			System.out.println("Invalid Admin Credentials");
			System.out.print("Do you want to continue [yes/no]");
			continueChoice=sc.next();
			
		}while(continueChoice.equalsIgnoreCase("yes"));
		
		
		
	}


	
	

}
