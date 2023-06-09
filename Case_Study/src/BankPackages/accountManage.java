package BankPackages;
import java.util.Scanner;
import Main.*;



public class accountManage {

	static String name;
	
	static String choice = "";
	
	boolean printReceipt = false;

	static Scanner input = new Scanner(System.in);
	
	static String manage = "";

	static int money;

	static String transactionType = "";
	
	public static void accountManage() {
		
        var Red = "\u001b[41;1m";
        var Green = "\u001b[42;1m";
        var Reset = "\u001b[0m";
        var Yellow = "\u001b[43;1m";
		
		banner.accountManageBanner();
		while(true) {
			System.out.println("+======================================+");
			System.out.println("[1]  Balance Inquiry ");
			System.out.println("[2]  Deposit ");
			System.out.println("[3]  Withdraw ");
			System.out.println("[4]  Print Receipt ");
			System.out.println("[5]  Change Password ");
			System.out.println("[6]  Back to Login ");
			System.out.println("[7]  EXIT   ");
			System.out.print("Enter Selection: ");
			manage = input.next();
			System.out.println("+======================================+");
			
			if(manage.equals("1")) {
				System.out.println();
				transactionType = "Balance Inquiry";
				System.out.println("\033[0;32m"+"Your current balance is: $" + Main.map.get(login.accountLogged)+ "\033[0m");
				System.out.println();
			}
			//Deposit || HashMap "replace" Value to current + deposit amount
			if(manage.equals("2")) {
				System.out.println();
				transactionType = "Deposit";
				System.out.print("Enter amount to deposit: ");
				money = input.nextInt();
				
				System.out.print(Red);
				System.out.print("Please Enter Password: ");
				String password = input.next();
				System.out.print(Reset);
				
				if (password.equals(login.accountLoggedPin)) {
					Main.map.replace(login.accountLogged, Main.map.get(login.accountLogged) + money);
					System.out.println("\nSuccessfully deposited $" + money);
					System.out.println("\033[0;32m"+"Current Balance: $" + Main.map.get(login.accountLogged)+ "\033[0m");
					System.out.println();
					Main.saveData();
				}else {
					System.out.println("Transaction Cancelled! Password Incorrect!");
				}
				
				
			}
			//Withdraw || HashMap "replace" Value to current - withdraw amount
			if(manage.equals("3")) {
				System.out.println();
				transactionType = "Withdraw";
				System.out.print("Enter amount to withdraw: ");
				money = input.nextInt();
				
				System.out.print(Red);
				System.out.print("Please Enter Password: ");
				String password = input.next();
				System.out.print(Reset);
				
				if(password.equals(login.accountLoggedPin)) {
					// if withdraw amount is greater than the current balance, prints "Withdraw amount is greater than account balance." 
					int withdraw = Main.map.get(login.accountLogged) - money;
					
					if(money > Main.map.get(login.accountLogged)) {
						System.out.println("\033[0;31m"+"Sorry, You have no balance in your account to withdraw."+ "\033[0m");
						System.out.println();
					}else {
						Main.map.replace(login.accountLogged,withdraw);
						System.out.println("\033[0;31m"+"Successfully withdrew $" + money+"\033[0m");
						System.out.println("\033[0;32m"+"Current Balance: $" + Main.map.get(login.accountLogged)+"\033[0m");
						System.out.println();
						Main.saveData();
					}
				}else {
					System.out.println("Transaction Cancelled! Password Incorrect!");
				}			
			}
					
			// print receipt
			if(manage.equals("4")) {
				Receipt receipt = new Receipt();
				receipt.run();
			}
			
			// Change Password
			if(manage.equals("5")) {
				changePassword.changePass();
				System.out.println();
			}
			
			// Back to login 
			if(manage.equals("6")) {
				login.login();
				break;
			}
			
			// exit program
			if(manage.equals("7")) {
				System.out.println("\nThank you for banking with us.");
				System.exit(0);
			}
		}
	}
	
	
	public static void receipt() {
		Receipt receipt = new Receipt();
		receipt.run();
	}
	

}
