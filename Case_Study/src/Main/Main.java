package Main;
import BankPackages.*;
import java.util.HashMap;
public class Main {
	 // create a HashMap to store account numbers and balances
	public static HashMap <String, Integer> map = new HashMap<>();
	
	public static void accounts() {
		// add some initial account numbers and balances to the HashMap
		map.put("12345", 1000);
		map.put("67890", 2000);
		map.put("09876", 3000);
		map.put("54321", 4000);
		map.put("10293", 5000);
	}	
	public static void main(String[] args) {
		// call the accounts() method to initialize the HashMap
		accounts();
		
		// display the "JaBank" banner
		banner.banner();
		
		// call the log() method to begin the program
		log.log();	
	}
}
