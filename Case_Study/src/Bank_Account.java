import java.util.HashMap;
import java.util.Scanner;

public class Bank_Account {
	
	static Bank_Account bk = new Bank_Account();
	
	//Initialie Scanner
	Scanner input = new Scanner(System.in);
	
	//Initialize HashMap 
	static HashMap <String, Integer> map = new HashMap<>();
	
	//Using HashMap to pair K/V or Account to Money || HashMaps are use to map certain Key to a Value
	public void accounts() {
		map.put("12345", 1000);
		map.put("67890", 2000);
		map.put("09876", 3000);
		map.put("54321", 4000);
		map.put("10293", 5000);
		map.put(tempAccountID, 0);
	}
	
	//for Selection purposes || Holds what the user selected
	static String selection = "";
	String manage = "";
	
	//Account Number and Pin for "Login" purposes
	static String accountID = "";
	static String accountPin = "";
	//hold what user is logged in 
	static int user = 0;
	static String accountLogged = "";
	static int deposit = 0;
	
	String tempAccountID = "";
	String tempAccountPin = "";
	
	//2D array for Bank Accounts  --- length may change due to "Create Account" function || Added "tempUser"
	static String[][] users = {
			{"12345", "12345"},
			{"67890", "67890"},
			{"09876", "09876"},
			{"54321", "54321"},
			{"10293", "10293"}
	};
	
	
	
	// class for printing "Banner" and Landing Page || "Welcome Screen"
	void banner() {
		bk.accounts();
		String[] logo = {
				"||=====================================================================================================================||",
				"||              JJJJJJJJJJJ                BBBBBBBBBBBBBBBBB                                       kkkkkkk             ||",
				"||              J:::::::::J                B::::::::::::::::B                                      k:::::k             ||",
				"||              J:::::::::J                B::::::BBBBBB:::::B                                     k:::::k             ||",
				"||              JJ:::::::JJ                BB:::::B     B:::::B                                    k:::::k             ||",
				"||                J:::::J  aaaaaaaaaaaaa     B::::B     B:::::B  aaaaaaaaaaaaa  nnnn  nnnnnnnn     k:::::k    kkkkkkk  ||",
				"||                J:::::J  a::::::::::::a    B::::B     B:::::B  a::::::::::::a n:::nn::::::::nn   k:::::k   k:::::k   ||",
				"||                J:::::J  aaaaaaaaa:::::a   B::::BBBBBB:::::B   aaaaaaaaa:::::an::::::::::::::nn  k:::::k  k:::::k    ||",
				"||                J:::::j           a::::a   B:::::::::::::BB             a::::ann:::::::::::::::n k:::::k k:::::k     ||",
				"||                J:::::J    aaaaaaa:::::a   B::::BBBBBB:::::B     aaaaaaa:::::a  n:::::nnnn:::::n k::::::k:::::k      ||",
				"||    JJJJJJJ     J:::::J  aa::::::::::::a   B::::B     B:::::B  aa::::::::::::a  n::::n    n::::n k:::::::::::k       ||",
				"||    J:::::J     J:::::J a::::aaaa::::::a   B::::B     B:::::B a::::aaaa::::::a  n::::n    n::::n k:::::::::::k       ||",
				"||    J::::::J   J::::::Ja::::a    a:::::a   B::::B     B:::::Ba::::a    a:::::a  n::::n    n::::n k::::::k:::::k      ||",
				"||    J:::::::JJJ:::::::Ja::::a    a:::::a BB:::::BBBBBB::::::Ba::::a    a:::::a  n::::n    n::::nk::::::k k:::::k     ||",
				"||     JJ:::::::::::::JJ a:::::aaaa::::::a B:::::::::::::::::B a:::::aaaa::::::a  n::::n    n::::nk::::::k  k:::::k    ||",
				"||       JJ:::::::::JJ    a::::::::::aa:::aB::::::::::::::::B   a::::::::::aa:::a n::::n    n::::nk::::::k   k:::::k   ||",
				"||        JJJJJJJJJ       aaaaaaaaaa  aaaaBBBBBBBBBBBBBBBBB     aaaaaaaaaa  aaaa nnnnnn    nnnnnnkkkkkkkk    kkkkkkk   ||",
				"||=====================================================================================================================||"
				};

		int width = logo[0].length();
	    for (String line : logo) {
	        int padding = (width - line.length()) / 2;
	        String paddedLine = String.format("%" + (padding + line.length()) + "s", line);
	        System.out.println(paddedLine);
	    }
	    System.out.println("\n\n\n");
	        /*
	        // define dimensions of the rectangle
	        int width = logo[0].length() + 2;
	        int height = logo.length + 2;
	        
	        // calculate horizontal and vertical padding for centering
	        int horizontalPadding = (80 - width) / 2;
	        int verticalPadding = (24 - height) / 2;
	        
	        // draw the rectangle with padding
	        for (int i = 0; i < verticalPadding; i++) {
	            System.out.println();
	        }
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < horizontalPadding; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < width; j++) {
	                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	        // print the banner inside the rectangle with padding
	        for (int i = 0; i < logo.length; i++) {
	            System.out.print(" ");
	            for (int j = 0; j < horizontalPadding; j++) {
	                System.out.print(" ");
	            }
	            System.out.print("* ");
	            System.out.print(logo[i]);
	            System.out.print(" *");
	            System.out.println();
	        }
	        
	        // draw the rectangle again to close it off with padding
	        for (int i = 0; i < height ; i++) {
	            for (int j = 0; j < horizontalPadding; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < width; j++) {
	                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        for (int i = 0; i < verticalPadding; i++) {
	            System.out.println();
	        }	*/
	}
	void log() {
		bk.accounts();
		System.out.println();
		System.out.println("[1]  Login  ");
		System.out.println("[2]  Create Account   ");
		System.out.println("[3]  EXIT   ");
	        
		System.out.print("Enter Selection: ");
		selection = input.next();
	}
	
	// Log In page || Ask the user to input correct acctNum and acctPin || will ask the user to create new account if acctNum & pin are incorrect
	void login() {
		bk.accounts();
		System.out.println();
		System.out.println("+======================================+");
		System.out.println("+                 Login                +");
		System.out.println("+======================================+");
		System.out.println();
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
				
				bk.accountManage();
				break;
			}else {
				System.out.println();
				System.out.println("No accounts found");
				System.out.println("Would you like to create an account?    ");
				System.out.println("[1]  Yes  ");
				System.out.println("[2]  No   ");
				System.out.print("Enter Selection: ");
				int response = input.nextInt();
				if(response == 1) {
					bk.createAccount();
					break;
				}else {
					System.out.println();
					System.out.println("Try Again");
				}
			}
		}				
	}
	
	//Acts as a home page for the user || provides "basic" bank services like deposit, withdraw, and balance inquiry
	void accountManage() {
		bk.accounts();
		System.out.println();
		System.out.println("+======================================+");
		System.out.println("+    Welcome Account Number "+ accountLogged +"      +");
		System.out.println("+======================================+");
		System.out.println();
		while(true) {
			System.out.println("+======================================+");
			System.out.println("[1]  Balance Inquiry ");
			System.out.println("[2]  Deposit ");
			System.out.println("[3]  Withdraw ");
			System.out.println("[4]  Back to Login ");
			System.out.println("[5]  EXIT   ");
			System.out.print("Enter Selection: ");
			manage = input.next();
			System.out.println("+======================================+");
			
			if(manage.equals("1")) {
				System.out.println();
				System.out.println("Your current balance is: $" + map.get(accountLogged));
				System.out.println();
			}
			//Deposit || HashMap "replace" Value to current + deposit amount
			if(manage.equals("2")) {
				System.out.println();
				System.out.print("Enter amount to deposit: ");
				deposit = input.nextInt();
				map.replace(accountLogged, map.get(accountLogged) + deposit);
				System.out.println("Successfully deposited $" + deposit);
				System.out.println("Current Balance: $" + map.get(accountLogged));
				System.out.println();
			}
			//Withdraw || HashMap "replace" Value to current - withdraw amount
			if(manage.equals("3")) {
				System.out.println();
				System.out.print("Enter amount to withdraw: ");
				int withdraw = input.nextInt();
				// if withdraw amount is greater than the current balance, prints "Withdraw amount is greater than account balance." 
				if(withdraw > map.get(accountLogged)) {
					System.out.println("Sorry, You have no balance in your account to withdraw.");
					System.out.println();
				}else {
					map.replace(accountLogged, map.get(accountLogged) - withdraw);
					System.out.println("Successfully withdrew $" + withdraw);
					System.out.println("Current Balance: $" + map.get(accountLogged));
					System.out.println();
				}
				
			}
			if(manage.equals("4")) {
				bk.login();
				break;
			}
			if(manage.equals("5")) {
				System.out.println("\nThank you for banking with us.");
				System.exit(0);
			}
		}
	}
	
	//Create Account Function || only holds temporary account
	void createAccount() {
		bk.accounts();
		System.out.println();
		System.out.println("+======================================+");
		System.out.println("+         Create an Account            +");
		System.out.println("+======================================+");
		System.out.println();
		System.out.print("Enter Account Number: ");
		tempAccountID = input.next();
		System.out.print("Enter Account Pin: ");
		tempAccountPin = input.next();
		
		String[][] tempUsers = new String[users.length + 1][2];
		for(int i = 0; i < users.length; i++) {
			tempUsers[i] = users[i];
		}
		tempUsers[users.length] = new String[] {tempAccountID, tempAccountPin};
		
		Bank_Account.users = tempUsers;
		
		System.out.println();
		System.out.println("Account successfully created.");
		bk.login();
	}

	public static void main(String[] args) {
		bk.accounts();
		
		// Try and Catch
		try {
			bk.banner();
			while(true) {			
				bk.log();		
				if(selection.equals("1")) {
					bk.login();
					break;
				}else if(selection.equals("2")) {
					bk.createAccount();
					break;
				}else if(selection.equals("3")) {
					System.out.println("~terminated~");
					break;
				}else {
					System.out.println("Enter Valid Selection!");
				}
			}
			// Custom Error Message
		}catch(Exception e) {
			System.out.println("Error! Selection Invalid!");
		}
		
	}
}
