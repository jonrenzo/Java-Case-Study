package Main;

import BankPackages.*;
import java.io.*;
import java.util.HashMap;

public class Main {
    // File name to store the HashMap data
    private static final String DATA_FILE = "account_data.txt";

    // create a HashMap to store account numbers and balances
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void accounts() {
        // add some initial account numbers and balances to the HashMap
        map.put("12345", 1000);
        map.put("67890", 2000);
        map.put("09876", 3000);
        map.put("54321", 4000);
        map.put("10293", 9999);
    }

    public static void saveData() {
        try {
            FileWriter fileWriter = new FileWriter(DATA_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write each account number and balance to the file
            for (String accountNumber : map.keySet()) {
                int balance = map.get(accountNumber);
                bufferedWriter.write(accountNumber + ":" + balance);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error saving data file to : " + e.getMessage());
        }
    }

    public static void loadData() {
        try {
            FileReader fileReader = new FileReader(DATA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String accountNumber = parts[0];
                    int balance = Integer.parseInt(parts[1]);
                    map.put(accountNumber, balance);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error loading data from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // call the loadData() method to load data from the file
        loadData();

        // call the accounts() method to initialize the HashMap if the file is empty
        if (map.isEmpty()) {
            accounts();
            saveData(); // Save initial data to the file
        }

        // display the "JaBank" banner
        banner.banner();

        // call the log() method to begin the program
        log.log();

        // save the updated HashMap data to the file before exiting
        saveData();
    }
}
