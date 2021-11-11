/*  -------------------- Program Information --------------------
    Name Of Program: Palindrome.java
    Date of Creation: 11/9/21
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    Program Description: A program that prompts the user for a line of text then checks if the input is a
        palindrome
    -------------------- Program Information --------------------  */

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Initialize a field for input

        String quit = ""; // Initialize variable quit

        while (!quit.equalsIgnoreCase("Quit")) { // Outer loop to check for quit
            System.out.println("Input a string"); // Prompt for input
            String input = scan.nextLine();

            String reverseString = ""; // Initialize variable reverse string
            input.toLowerCase();

            /* Reverse the inputted string and check whether it is a palindrome or not */
            for (int i = input.length() - 1; i >= 0; i--) {
                reverseString = reverseString + input.substring(i, i + 1);
                System.out.println("Original: " + input);
                System.out.println("Reverse String: " + reverseString);

                if (input.length() == 1) {
                    System.out.println("Palindrome");
                    System.out.println(" ");
                } else if (input.equalsIgnoreCase(reverseString)) {
                    System.out.println("Palindrome");
                    System.out.println(" ");
                } else {
                    System.out.println("Not Palindrome");
                    System.out.println(" ");
                }
            }
            System.out.println("Would you like to quit?");
            quit = scan.nextLine();
        }
        scan.close(); // Closes scanner to prevent memory leak
        System.out.println("Goodbye.");
    }
}