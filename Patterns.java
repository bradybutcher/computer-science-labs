/*  -------------------- Program Information --------------------
    Name Of Program: Patterns.java
    Date of Creation: 11/10/21
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    Program Description: A program that uses nested loops to make an inverted triangle based on n(input) rows
    -------------------- Program Information --------------------  */

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many asterisks in the first line?"); // Prompt user for input
        int rows = scan.nextInt(); // Retrieve row number

        /* Inverted triangle */
        for (int i = rows; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= 1 * i - 1; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scan.close();// Prevents memory leak
    }
}