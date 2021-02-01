package com.cg.vm.util;

import java.util.InputMismatchException;

import org.hibernate.engine.transaction.jta.platform.internal.TransactionManagerBasedSynchronizationStrategy;

import com.cg.vm.bean.User;
import com.cg.vm.dao.IUserRepository;
import com.cg.vm.dao.IUserRepositoryImpl;
import com.cg.vm.service.IUserService;
import com.cg.vm.service.IUserServiceImpl;

/**
 * This is Customer Menu That Does Functions of Registration and LogIn
 */
public class CustomerMenu extends VMSMainMenu{

	public void customerMenuStart() {
		int choice = 0;
		String continueChoice = null;
		do {
			showmenu();// Login Or Registration Menu
			System.out.println("Enter your choice");
			try
			{
				choice = scanner.nextInt();
			}
			catch(InputMismatchException i)
			{
				System.out.println(i);
			}
			switch (choice) {
			case 1:
				CustomerRegistrationMenu customerRegister = new CustomerRegistrationMenu();
				customerRegister.customerregisterstart();
				break;

			case 2:
				User checkUserLogin = customerValidation();// customer validation function
				if (checkUserLogin != null) {
					System.out.println("Hello " + checkUserLogin.getUserId() + "\n You Have Logged In SucessFully!");
					CustomerServicesMenu customerServicesMenu = new CustomerServicesMenu();//customer services 
					customerServicesMenu.customermenustart();

				} else {
					System.out.print("Invalid Credentials \n Log In Failed \n");
				}

				break;

			case 0:
				IUserService logoutOperation = new IUserServiceImpl();
				User user = new User();
				logoutOperation.signOut(user);
				break;

			default:
				System.out.print("Wrong choice Of Input \n ");

			}
			System.out.print("Do you want to continue to login menu"+ " [yes/no]");
			continueChoice = scanner.next();
			
		} while (continueChoice.equalsIgnoreCase("yes"));
		

	}

	/**
	 * Shows Customer Login Menu
	 */
	private void showmenu() {
		System.out.println("---------Customer Login-----------");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("0.LogOut");

	}

	/**
	 * validates a customer login id and username
	 * 
	 * @return user details if valid user else returns null
	 */
	public User customerValidation() {
		User user = new User();

		System.out.println("--------Customer Login-----------");

		System.out.println("Enter Your Username: ");
		String usrName = scanner.next();

		System.out.println("Enter Your Password:  ");
		String pwd = scanner.next();

		user.setUserId(usrName);
		user.setPassword(pwd);
		user.setRole("Customer");

		System.out.println("Please Wait! Checking Your Login Credentials");
		IUserRepository uservalidation = new IUserRepositoryImpl();
		User loggedUser = uservalidation.validateUser(user);
		return loggedUser;

	}

}
