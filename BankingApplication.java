package bankingapplication; // Used to group the related BankAccount class with the BankingApplication class.

import java.util.Scanner; // Explicit scanner import.

public class BankingApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Sagineedu Banking Services!"); // Initial welcome message that is displayed to the user.
        java.util.Date date = new java.util.Date(); // An object that represents the current date and time in java.
        System.out.println("Today is " + date); // Prints the current date and time in the display for the user.
        Scanner userInput = new Scanner(System.in); // This scanner object has been created to take the user's input into the program.
        System.out.println(); // An empty line is printed.
        System.out.println();
        System.out.println("Please enter your full name below:"); // Asks the user for their full name, which refers to the customer name.
        String customerName = userInput.nextLine(); // The scanner object will take the input of the user, and this value will be loaded into the customerName variable in the constructor.
        BankAccount bankAccount = new BankAccount(customerName); // The object BankAccount has been created, and the customer name is passed through the constructor.
        bankAccount.showMenu(); // Invokes the show menu method.

    }

}




