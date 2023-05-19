package BankPackages;
import java.util.Scanner;

public class login {
	
	static String tempID = createAccount.tempAccountID;
	static String tempPin = createAccount.tempAccountPin;
	
	// 2D String array containing default user accounts and the last created account
	static String[][] users = {
			{"12345", "12345"},
			{"67890", "67890"},
			{"09876", "09876"},
			{"54321", "54321"},
			{"10293", "10293"},
			{createAccount.tempAccountID, createAccount.tempAccountPin}
	};
	
	
	static String accountID = "";
	static String accountPin = "";
	static int user = 0;
	public static String accountLogged = "";
	
	static Scanner input = new Scanner(System.in);
	
	public static void login() {
		System.out.println();
		System.out.println("+======================================+");
		System.out.println("+                 Login                +");
		System.out.println("+======================================+");
		System.out.println();
		// Loop for multiple login attempts
		while(true) {
			System.out.print("Enter Account Number: ");
			accountID = input.next();
			System.out.print("Enter Account Pin: ");
			accountPin = input.next();
			
			boolean loginSuccess = false;			
			
			for(int i = 0; i < users.length; i++) {
				for(int j= 0 ; j < users[i].length; j++) {
					if(accountID.equals(users[i][0]) && accountPin.equals(users[i][1])) {
						loginSuccess = true;
						accountLogged = users[i][0];
						user = i;
						break;
					}
				}
			}
			
			if(loginSuccess) {
				accountManage.accountManage();
				break;
			}else {
				// If login failed, prompt user to create a new account or try again
				System.out.println();
				System.out.println("No accounts found");
				System.out.println("Would you like to create an account?    ");
				System.out.println("[1]  Yes  ");
				System.out.println("[2]  No   ");
				System.out.print("Enter Selection: ");
				int response = input.nextInt();
				if(response == 1) {
					// If user chooses to create a new account, call the createAccount method and break out of the loop
					createAccount.createAccount();
					break;
				}else {
					// If user chooses not to create a new account, display a message and continue the loop
					System.out.println();
					System.out.println("Try Again");
				}
			}
		}		
	}

}
