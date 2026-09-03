public class BankAccount {

    
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolderName, double balance) {

        
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Invalid Account Number");
        } else if (accountNumber.length() < 5) {
            System.out.println("Account Number must contain at least 5 characters");
        } else {
            this.accountNumber = accountNumber;
        }

        if (accountHolderName == null || accountHolderName.isEmpty()) {
            System.out.println("Invalid Account Holder Name");
        } else if (accountHolderName.length() < 3) {
            System.out.println("Account Holder Name must contain at least 3 characters");
        } else {
            this.accountHolderName = accountHolderName;
        }

        
        if (balance < 0) {
            System.out.println("Invalid Initial Balance");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Invalid Account Number");
        } else if (accountNumber.length() < 5) {
            System.out.println("Account Number must contain at least 5 characters");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName == null || accountHolderName.isEmpty()) {
            System.out.println("Invalid Account Holder Name");
        } else if (accountHolderName.length() < 3) {
            System.out.println("Account Holder Name must contain at least 3 characters");
        } else {
            this.accountHolderName = accountHolderName;
        }
    }

    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance can't be negative");
        } else {
            this.balance = balance;
        }
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal: " + amount);
        }
    }


    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }


    public static void main(String[] args) {

        
        BankAccount account = new BankAccount(
                "ACC1001",
                "Rahul Sharma",
                5000.0
        );

        
        account.displayAccountDetails();

        
        account.deposit(2000);

        account.withdraw(3000);

        
        System.out.println("Updated Balance: " + account.getBalance());
    }
}