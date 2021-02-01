package com.cg.vm.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.vm.bean.User;
import com.cg.vm.service.IUserService;
import com.cg.vm.service.IUserServiceImpl;

public class CustomerServicesMenu extends VMSMainMenu{

	public void customermenustart() {

		// customer menu

		String continueChoice;
		do {
			System.out.println("1.Booking Operations");
			System.out.println("2.Update your details");
			System.out.println("0.Logout");

			System.out.println("Please select your choice");
			int customerChoice = 0;
					try{
						customerChoice =scanner.nextInt();
					}
					catch(InputMismatchException i)
					{
						System.out.println("Wrong Input Type!");
					}
			switch (customerChoice) {
			case 1:
                  	Bookingmenu book = new Bookingmenu();
                  	book.bookingmenustart();
				break;
			case 2:
				break;
			case 0:
				IUserService logoutOperation = new IUserServiceImpl();
				User user = new User();
				logoutOperation.signOut(user);
			default:
				System.out.print("Wrong choice \n ");

			}

			System.out.print("Do you want to continue To Your Services [yes/no]");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes"));


		return;
	}

}
