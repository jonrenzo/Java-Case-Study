public class BankAccount {
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public static void main(String[] args) {
    	String accountName =""; 
    	BankAccount account3 = new BankAccount(accountName, 5000);
    	
    	
        BankAccount account1 = new BankAccount("John Doe", 1000);
        BankAccount account2 = new BankAccount("Jane Smith", 500);
        
        System.out.println("Account holder: " + account1.getAccountHolder());
        System.out.println("Balance: $" + account1.getBalance());
        account1.deposit(500);
        System.out.println("New balance: $" + account1.getBalance());
        account1.withdraw(2000);
        System.out.println("New balance: $" + account1.getBalance());
        
        System.out.println("Account holder: " + account2.getAccountHolder());
        System.out.println("Balance: $" + account2.getBalance());
        account2.withdraw(100);
        System.out.println("New balance: $" + account2.getBalance());
    }
}