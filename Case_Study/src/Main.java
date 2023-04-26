import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	
	HashMap <String, Integer> map = new HashMap<>();
	
	public void accounts() {
		map.put("12345", 1000);
		map.put("67890", 1000);
		map.put("09876", 1000);
		map.put("54321", 1000);
		map.put("10293", 1000);
	}
	
	//user name and password entries
	//length can be change due to "create account" option
	static String[][] users = {
			{"12345", "12345"},
			{"67890", "67890"},
			{"09876", "09876"},
			{"54321", "54321"},
			{"10293", "10293"}
	};
	
	public static void banner() {	  
		String[] logo = {
	            " _____         _      _____                                   _   ",
	            "| __  |___ ___| |_   |     |___ ___ ___ ___ ___ _____ ___ ___| |_ ",
	            "| __ -| .'|   | '_|  | | | | .'|   | .'| . | -_|     | -_|   |  _|",
	            "|_____|__,|_|_|_,_|  |_|_|_|__,|_|_|__,|_  |___|_|_|_|___|_|_|_|  ",
	            "                                       |___|                      "};
	        
	        // define dimensions of the rectangle
	        int width = logo[0].length() + 4;
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
	        
	        // print the logo inside the rectangle with padding
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
	        for (int i = 0; i < verticalPadding; i++) {
	            System.out.println();
	        }
	        }                                                                                                                     

	public static void selection() {
		//Selections on what the user will do
		System.out.println("[1]  Login  ");
		System.out.println("[2]  Create Account   ");
		System.out.println("[3]  EXIT   ");
	}
	

	public static void loginPage() {
		
		//"clearing" the console
		for (int x = 0; x < 200; x++) {
			System.out.println();
		}
			
			
			
			System.out.print("Enter Account Number: ");
			String username = input.next();
			
			System.out.print("Enter Account Pin: ");
			String password = input.next();
			
			try {
				for(int i = 0; i < users.length; i++) {
					for(int j = 0; j < users[i].length; j++) {
						if(username.equals(users[i][0]) && password.equals(users[j][1])){
							for(int z = 0; z < 200; z++) {
								System.out.println();
							}
							banner();
							System.out.println("Hello Account Number " + users[i][0]);
							System.out.println();
							accountPage();
						}
					}	
				}
			} catch (Exception e) {
				// System.out.println Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	public static void accountPage() {
		
		
		System.out.println("[1]  Balance Inquiry  ");
		System.out.println("[2]  Withdraw   ");
		System.out.println("[3]  Deposit   ");
		System.out.println("[4]  Back   ");
	}
	
	public static void createAccount() {
		
		boolean foundSimilarAccount = false;
		
		System.out.print("Enter Account Number: ");
		String newAccount = input.next();
		
		for(int i = 0; i < users.length; i++) {
		    if(!newAccount.equals(users[i][0])) {
		        foundSimilarAccount = true;
		    } else {
		        foundSimilarAccount = false;
		        break;
		    }
		}
		
		if (foundSimilarAccount) {
		    System.out.println("No similar account found");
		    users[users.length-1][0] = newAccount;
		}
		
		System.out.print("Enter Account Pin: ");
		String newPin = input.next();
		users[users.length-1][1] = newPin;
		
		
		
	}
	
	
	public static void main(String[] args)  {
		
		banner();
		selection();
		
		System.out.print("Enter Number: ");
		String x = input.next();
		
		if(x.equals("1")) {
			loginPage();
		}else if(x.equals("2")) {
			createAccount();
			banner();
			selection();
			
			System.out.print("Enter Number: ");
			String c = input.next();
			
			if(c.equals("1")) {
				loginPage();
		}
		
			
	}

}}
