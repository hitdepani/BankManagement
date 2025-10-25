// BankSystem.java
import java.util.Scanner;

public class BankSystem {
    
    static Account[] acc = new Account[5];
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // creating accounts
        acc[0] = new Account("101", "Rahul Sharma", "1234", 15000);
        acc[1] = new Account("102", "Priya Patel", "2345", 25000);
        acc[2] = new Account("103", "Amit Kumar", "3456", 32000);
        acc[3] = new Account("104", "Sneha Singh", "4567", 18000);
        acc[4] = new Account("105", "Vikram Reddy", "5678", 42000);
        
        System.out.println("Welcome to Bank of India");
        System.out.println("\n--- Available Accounts ---");
        System.out.println("101 - Rahul Sharma (PIN: 1234)");
        System.out.println("102 - Priya Patel (PIN: 2345)");
        System.out.println("103 - Amit Kumar (PIN: 3456)");
        System.out.println("104 - Sneha Singh (PIN: 4567)");
        System.out.println("105 - Vikram Reddy (PIN: 5678)");
        
        Account user = doLogin();
        
        if (user != null) {
            System.out.println("\nLogin successful!");
            System.out.println("Welcome " + user.getName());
            
            while (true) {
                menu();
                int ch = sc.nextInt();
                
                if (ch == 1) {
                    user.showDetails();
                } else if (ch == 2) {
                    System.out.print("\nEnter amount to deposit: Rs.");
                    double amt = sc.nextDouble();
                    user.deposit(amt);
                } else if (ch == 3) {
                    System.out.print("\nEnter amount to withdraw: Rs.");
                    double amt = sc.nextDouble();
                    user.withdraw(amt);
                } else if (ch == 4) {
                    System.out.println("\nThank you for banking with us!");
                    break;
                } else {
                    System.out.println("Wrong choice");
                }
            }
        } else {
            System.out.println("Wrong account number or PIN");
        }
    }
    
    public static Account doLogin() {
        System.out.print("\nEnter account number: ");
        String no = sc.next();
        System.out.print("Enter PIN: ");
        String pin = sc.next();
        
        for (int i = 0; i < acc.length; i++) {
            if (acc[i].getAccNo().equals(no) && acc[i].checkPin(pin)) {
                return acc[i];
            }
        }
        return null;
    }
    
    public static void menu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }
}