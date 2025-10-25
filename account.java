// Account.java
class Account {
    //Encapsulation
    private String accNo;
    private String name;
    private String pin;
    private double balance;
    
    //Constructor
    public Account(String accNo, String name, String pin, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    
    public String getAccNo() {
        return accNo;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean checkPin(String pin) {
        return this.pin.equals(pin);
    }
    
    //deposit
    public void deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Rs." + amt + " deposited successfully");
            System.out.println("New balance: Rs." + balance);
        } else {
            System.out.println("Please enter valid amount");
        }
    }
    //withdraw
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance = balance - amt;
            System.out.println("Rs." + amt + " withdrawn successfully");
            System.out.println("New balance: Rs." + balance);
        } else if (amt > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Please enter valid amount");
        }
    }
    
    //display account info
    public void showDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}