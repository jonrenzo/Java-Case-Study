package BankPackages;

import Main.Main;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

// \u001b[42;1m - Green 
// \u001b[41;1m - Red 
// \u001b[40;1m - Reset

public class changePassword {
    private static final String DATA_FILE = "users.txt";

    public static void changePass() {
        var Red = "\u001b[41;1m";
        var Green = "\u001b[42;1m";
        var Reset = "\u001b[40;1m";
        var Yellow = "\u001b[43;1m";

        Scanner input = new Scanner(System.in);
        System.out.print(Yellow);
        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();
        System.out.print(Reset);

        HashMap<String, String> users = new HashMap<>();
        loadUsers(users);

        if (users.containsKey(accountNumber)) {
            System.out.print(Red);
            System.out.print("Enter Current PIN: ");
            String currentPin = input.nextLine();
            System.out.print(Reset);

            if (currentPin.equals(users.get(accountNumber))) {
                System.out.print(Green);
                System.out.print("Enter New PIN: ");
                String newPin = input.nextLine();
                System.out.print(Reset);
                users.put(accountNumber, newPin);
                saveUsers(users);
                System.out.println("PIN changed successfully!");
                System.out.println("\u001b[0m");
                login.login();
            } else {
                System.out.println("Incorrect PIN!");
            }
        } else {
            System.out.println("Account Number not found!");
        }
    }


    private static void loadUsers(HashMap<String, String> users) {
        try {
            FileReader fileReader = new FileReader(DATA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0];
                    String accountNumber = parts[1];
                    String pin = parts[2];
                    int balance = Integer.parseInt(parts[3]);

                    users.put(accountNumber, pin);
                    Main.nameMap.put(accountNumber, name); // Add name to nameMap based on your implementation
                    Main.map.put(accountNumber, balance); // Add balance to map based on your implementation
                    
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error loading user data from file: " + e.getMessage());
        }
    }

    private static void saveUsers(HashMap<String, String> users) {
        try {
            FileWriter fileWriter = new FileWriter(DATA_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String accountNumber : users.keySet()) {
                String name = Main.nameMap.get(accountNumber); // Add logic to retrieve name based on your implementation
                String pin = users.get(accountNumber);
                int balance = Main.map.get(accountNumber); // Add logic to retrieve balance based on your implementation

                bufferedWriter.write(name + "," + accountNumber + "," + pin + "," + balance);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error saving user data to file: " + e.getMessage());
        }
    }
}
