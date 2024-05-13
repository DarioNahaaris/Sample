package oops;



import java.util.Scanner;

interface BankAccount {
    void displayAccountDetails();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String bankname;
    private String accountHolderName;
    private double balance;

    public SavingsAccount(String bankName, String accountNumber, String accountHolderName, double balance) {
        this.bankname = bankName;
    	this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Bank Name: " +bankname);
    	System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

 
        


public class sbi 
{

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
       
        
        // Input account details
        
        System.out.println("Enter the Bank Name");
         String bankName=scanner.nextLine();
        System.out.println("Enter Account Number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter Account Holder Name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter Initial Balance:");
        double initialBalance = scanner.nextDouble();
        
        SavingsAccount account = new SavingsAccount(bankName,accountNumber, accountHolderName, initialBalance);

        // Display initial account details
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();

        // Deposit
        System.out.println("Enter the Deposit Amount");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Account Details after deposit:");
        account.displayAccountDetails();

        // Withdraw
        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);
        System.out.println("Account Details after withdrawal:");
        account.displayAccountDetails();
                    
    }
}
