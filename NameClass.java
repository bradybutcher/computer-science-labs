/**
 * Program that reads a full name (first and last as a single line), retrieves and outputs the name along with the length of each
 *
 * @Brady Butcher
 * @9/23/21
 */
import java.util.*;

public class NameClass {
    public static void main(String[] args) {
        // initialize a scanner
        Scanner scan = new Scanner(System.in);

        // Recieves input from the user
        System.out.println("Enter your first and last name ");
        String firstName = scan.next();
        String lastName = scan.next();

        // assigning variables
        String name = firstName + " " + lastName;
        int firstLength = firstName.length();
        int lastLength = lastName.length();
        char first = firstName.charAt(firstLength - 1);
        char last = lastName.charAt(lastLength - 1);

        // prints all input
        System.out.println(name);
        System.out.println("First name length: " + firstLength);
        System.out.println("Last name length: " + lastLength);

    }
}