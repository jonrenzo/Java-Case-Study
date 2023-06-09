package BankPackages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AccountCreator {

    private static final String FILE_PATH = "users.txt";

    public static void createAccount() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Account Number: ");
        String accountID = input.nextLine();
        System.out.print("Enter Account Pin: ");
        String accountPin = input.nextLine();

        if (name.isEmpty() || accountID.isEmpty() || accountPin.isEmpty()) {
            System.out.println("Account creation failed. Name, Account ID, and PIN cannot be empty.");
            AccountCreator.createAccount();
            System.out.println();
            return;
        }

        String[] userData = {name, accountID, accountPin};

        if (addAccountToFile(userData)) {
            System.out.println("Account created successfully.");
            login.login();
        } else {
            System.out.println("Failed to create account. Please try again.");
        }
    }

    private static boolean addAccountToFile(String[] userData) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true);
            writer.write(userData[0] + "," + userData[1] + "," + userData[2] +","+ "0" + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Failed to add account to file.");
            return false;
        }
    }
}
