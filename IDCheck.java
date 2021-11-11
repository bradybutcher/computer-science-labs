/*  -------------------- Program Information --------------------
    Name Of Program: IDCheck.java
    Date of Creation: 10/19/21
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    -------------------- Program Information --------------------  */

import java.util.Scanner;

public class IDCheck {

    private static Scanner scan = new Scanner(System.in); // Creates a field for input

    public static void main(String[] args) {
        System.out.println("Enter username: "); // Method to receive input from user
        final String username = scan.nextLine();
        System.out.println("Enter password: ");
        final String password = scan.nextLine();
        scan.close();

        final String actualUser = "admin"; // Defines the username and password
        final String actualPass = "open";

        if (username.equals(actualUser) && password.equals(actualPass)) { // Block to check input validity
            System.out.println("Welcome.");
        } else if (username != actualUser && password.equals(actualPass)) {
            System.out.println("Wrong username.");
        } else if (username.equals(actualUser) && password != actualPass) {
            System.out.println("Wrong password.");
        } else {
            System.out.println("Invalid username and password.");
        }
    }
}