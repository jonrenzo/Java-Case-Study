package BankPackages;
import java.util.Scanner;


/*
 * Displays the main menu and prompts the user to select an option.
 * If the user selects option 1, the login process is initiated.
 * If the user selects option 2, the create account process is initiated.
 * If the user selects option 3, the application will exit.
 * If the user selects an invalid option, an error message is displayed and the menu is reprinted.
 */

public class log {
	
	static String selection = "";
	static Scanner input = new Scanner(System.in);
	
	public static void log() {
		while (true) {
	        System.out.println();
	        System.out.println("[1]  Login  ");
	        System.out.println("[2]  Create Account   ");
	        System.out.println("[3]  EXIT   ");

	        System.out.print("Enter Selection: ");
	        selection = input.next();

	        if (selection.equals("1")) {
	            login.login();
	            break;
	        } else if (selection.equals("2")) {
	            createAccount.createAccount();
	            break;
	        } else if (selection.equals("3")) {
	            System.exit(0);
	        } else {
	            System.out.println("Invalid selection. Please inside the range\n");
	        }
	    }
	}
}
