package BankPackages;
import java.util.Scanner;

import Main.Main;

/*
* This is a class to handle the creation of a new bank account.
* It contains a static array of existing users with account IDs and pins.
* It prompts the user to enter a new account ID and pin.
* It creates a new array with the existing users plus the new account.
* It updates the static array in the login class with the new array.
* It adds the new account to a HashMap in the main class with an initial balance of 0.
*/


public class createAccount {
	
	// Declaring static variables	
	public static String tempAccountID = "";
	public static String tempAccountPin = "";
	public static String tempAccountName;
	
	// Declaring and initializing a static 2D array with pre-defined user account details
	static String[][] users = {
			{"12345", "12345"},
			{"67890", "67890"},
			{"09876", "09876"},
			{"54321", "54321"},
			{"10293", "10293"},
			{tempAccountID,tempAccountPin}
	};
	
	static accountName acctName = new accountName();
	
	static Scanner input = new Scanner(System.in);

	public static void createAccount() {

		banner.createAccountBanner();
		// Taking user input for account number and pin
		System.out.print("Enter Account Number: ");
		tempAccountID = input.next();
		System.out.print("Enter Account Pin: ");
		tempAccountPin = input.next();
		System.out.print("Enter Account Name: ");
		tempAccountName = input.next();
		
		// Creating a temporary 2D array to store all existing and the new user account details
		String[][] tempUsers = new String[users.length + 1][2];
		for(int i = 0; i < users.length; i++) {
			tempUsers[i] = users[i];
		}
		
		tempUsers[users.length] = new String[] {tempAccountID, tempAccountPin};
		
		// Updating the static user 2D array in the login class
		login.users = tempUsers;
	
		
		// Adding the new user account to the account balance map in the Main class with 0 balance
		Main.map.put(tempAccountID, 0);
		
		// Printing success message and redirecting to login page
		System.out.println();
		System.out.println("Account successfully created.");
		login.login();
	}
	
	public static String getTempName() {
		return tempAccountName;
	}
}
