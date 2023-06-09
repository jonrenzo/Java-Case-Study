package BankPackages;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class login {

    static String tempID = createAccount.tempAccountID;
    static String tempPin = createAccount.tempAccountPin;

    // ArrayList to store user accounts
    static ArrayList<String[]> users = new ArrayList<>();

    static String accountLoggedPin = "";
    public static String accountName = "";
    static String accountID = "";
    static String accountPin = "";
    static int user = 0;
    public static String accountLogged = "";

    static Scanner input = new Scanner(System.in);

    public static void login() {

        accountName acctname = new accountName();
        
        Scanner input = new Scanner(System.in);

        banner.loginBanner();
        // Loop for multiple login attempts
        while (true) {
            boolean loginSuccess = false;
            banner.scanCard();

            System.out.print("Enter Account Number: ");
            accountID = input.nextLine();
            System.out.print("Enter Account Pin: ");
            accountPin = input.nextLine();

            if (accountID.isEmpty() || accountPin.isEmpty()) {
                loginSuccess = false;
            } else {
                // Load user data from the text file
                loadUsers();

                for (int i = 0; i < users.size(); i++) {
                    String[] userData = users.get(i);
                    if (accountID.equals(userData[1]) && accountPin.equals(userData[2])) {
                        loginSuccess = true;
                        accountLogged = userData[1];
                        accountLoggedPin = userData[2];
                        accountName = userData[0];
                        user = i;
                        break;
                    }
                }
            }

            if (loginSuccess) {
                accountManage.accountManage();
                break;
            } else {
                // If login failed, prompt the user to create a new account or try again
                System.out.println();
                System.out.println("\033[0;31m" + "No accounts found!" + "\033[0m");
                System.out.println("Would you like to create an account?    ");
                System.out.println("[1]  Yes  ");
                System.out.println("[2]  No   ");
                System.out.print("Enter Selection: ");
                int response = input.nextInt();
                if (response == 1) {
                    // If the user chooses to create a new account, call the createAccount method and break out of the loop
                    //createAccount.createAccount();
                	AccountCreator.createAccount();
                   break;
                } else {
                    // If the user chooses not to create a new account, display a message and continue the loop
                    System.out.println();
                    System.out.println("Please Try Again");
                    input.nextLine();
                }
            }
        }
        input.close();
    }

    // Method to load user data from the text file
    private static void loadUsers() {
        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(file);
            users.clear(); // Clear the existing user data

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] userData = line.split(","); // Assuming the delimiter is a comma
                users.add(userData);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to load user data.");
        }
    }
}
