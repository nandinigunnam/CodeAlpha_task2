package codeAlpha;
import java.util.Scanner;
public class BankAccount {
    private static Scanner sc = new Scanner(System.in);
    private static double balance = 0;
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Welcome to Simple Banking App!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: "); 
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Banking App. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        sc.close();
    }
    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }
    private static void deposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    private static void withdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}