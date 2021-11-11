/*  -------------------- Program Information --------------------
    Name Of Program: LoopingData.java
    Date of Creation: 11/4/21
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    Program Description: A program that takes 5 integer values representing exam grades (between 0
        and 100) from the keyboard. The program should not process values less than 0 or greater than 100, and
        produce a message that the exam grade is outside of the valid range. Prompt until 5 valid exam grades
        have been entered. Output the minimum value, maximum value, and average value (as a double) of the
        valid exam grades entered. 
    -------------------- Program Information --------------------  */

import java.util.*;

public class LoopingData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Initialize variables */
        int count = 0;
        int max = -1;
        int min = -1;
        int input;
        int sum = 0;

        /* Loop to check whether grade is valid or invalid */
        while (count < 5) {
            System.out.println("Enter a valid grade");
            input = scan.nextInt();
            if (input < 0 || input > 100) { // Bad data
                System.out.println("Invalid grade");
            } else { // Good data
                count++;
                if (count == 1) { // First time
                    max = input;
                    min = input;
                } else { // Checks max and min values
                    if (input > max) {
                        max = input;
                    }
                    if (input < min) {
                        min = input;
                    }
                }
                sum += input;
            }
        }
        /* Print final data to user */
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + sum/5.0);
    }
}