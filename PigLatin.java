/*  -------------------- Program Information --------------------
    Name Of Program: PigLatin.java
    Date of Creation: 10/19/21
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    -------------------- Program Information --------------------  */

import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        String quit = "";

        while (!quit.equalsIgnoreCase("Quit")) {
            System.out.println("Enter a word to be translated into pig latin: ");
            input = scan.nextLine();
            input.toLowerCase();
            String con = input.substring(1);

            if (input.startsWith("a")) {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + input + "way");
                System.out.println("");
            } else if (input.startsWith("e")) {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + input + "way");
                System.out.println("");
            } else if (input.startsWith("i")) {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + input + "way");
                System.out.println("");
            } else if (input.startsWith("o")) {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + input + "way");
                System.out.println("");
            } else if (input.startsWith("u")) {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + input + "way");
                System.out.println("");
            } else {
                System.out.println("Original: " + input);
                System.out.println("Pig Latin: " + con + input.substring(0, 1) + "ay");
                System.out.println("");
            }
            System.out.println("Enter 'quit' if you wish to quit, otherwise type 'y'");
            quit = scan.nextLine();
            System.out.println("");
        }
        System.out.println("Goodbye");
    }
}