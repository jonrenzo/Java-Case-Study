package BankPackages;
import java.util.Scanner;
import Main.*;



public class accountManage {
	


	static Scanner input = new Scanner(System.in);
	
	static String manage = "";

	static int money;

	static String transactionType = "";
	
	public static void accountManage() {
		System.out.println();
		System.out.println("+======================================+");
		System.out.println("+    Welcome Account Number "+ login.accountLogged +"      +");
		System.out.println("+======================================+");
		System.out.println();
		while(true) {
			System.out.println("+======================================+");
			System.out.println("[1]  Balance Inquiry ");
			System.out.println("[2]  Deposit ");
			System.out.println("[3]  Withdraw ");
			System.out.println("[4]  Print Receipt ");
			System.out.println("[5]  Back to Login ");
			System.out.println("[6]  EXIT   ");
			System.out.print("Enter Selection: ");
			manage = input.next();
			System.out.println("+======================================+");
			
			if(manage.equals("1")) {
				System.out.println();
				transactionType = "Balance Inquiry";
				System.out.println("Your current balance is: $" + Main.map.get(login.accountLogged));
				System.out.println();
			}
			//Deposit || HashMap "replace" Value to current + deposit amount
			if(manage.equals("2")) {
				System.out.println();
				transactionType = "Deposit";
				System.out.print("Enter amount to deposit: ");
				money = input.nextInt();
				Main.map.replace(login.accountLogged, Main.map.get(login.accountLogged) + money);
				System.out.println("Successfully deposited $" + money);
				System.out.println("Current Balance: $" + Main.map.get(login.accountLogged));
				System.out.println();
			}
			//Withdraw || HashMap "replace" Value to current - withdraw amount
			if(manage.equals("3")) {
				System.out.println();
				transactionType = "Withdraw";
				System.out.print("Enter amount to withdraw: ");
				money = input.nextInt();
				// if withdraw amount is greater than the current balance, prints "Withdraw amount is greater than account balance." 
				if(money > Main.map.get(login.accountLogged)) {
					System.out.println("Sorry, You have no balance in your account to withdraw.");
					System.out.println();
				}else {
					Main.map.replace(login.accountLogged,Main.map.get(login.accountLogged) - money);
					System.out.println("Successfully withdrew $" + money);
					System.out.println("Current Balance: $" + Main.map.get(login.accountLogged));
					System.out.println();
				}
				
			}
			
			
			// go back to login screen
			if(manage.equals("4")) {
				Receipt receipt = new Receipt();
				receipt.run();
				break;
			}
			
			// exit program
			if(manage.equals("5")) {
				login.login();
				break;
			}
			if(manage.equals("6")) {
				System.out.println("\nThank you for banking with us.");
				System.exit(0);
			}
		}
	}
	

}
