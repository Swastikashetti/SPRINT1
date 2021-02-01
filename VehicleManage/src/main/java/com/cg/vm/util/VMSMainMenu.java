package com.cg.vm.util;

import java.util.Scanner;

import javax.management.Query;

import com.cg.vm.bean.Customer;
import com.cg.vm.bean.User;
import com.cg.vm.dao.IUserRepositoryImpl;

public class VMSMainMenu {
	public Scanner scanner = new Scanner(System.in);
	

	public void start() {
		String continueChoice = "";
		do {
			System.out.println("Select User");
			System.out.println("1.Administrator");
			System.out.println("2.Customer");
			int select_user = scanner.nextInt();

			switch (select_user) {
			case 1:
				AdminServicesMenu adminMenu = new AdminServicesMenu();
				adminMenu.adminmenustart();
				break;

			case 2:
				CustomerMenu customerMenu = new CustomerMenu();
				customerMenu.customerMenuStart();
				break;
			default:
				System.out.println("Invalid User");
				break;

			}
			System.out.print("Do you want to continue Main Menu [yes/no]");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes"));

		scanner.close();
	}

}
