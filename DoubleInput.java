/*
*Program that takes double as input, then computes and outputs the cube of the number using the pow method of the Math class
*/
import java.util.*;
public class DoubleInput {
    public static void main (String [] args) {
        //initalizes a scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double");
        
        //Taking the cube of the input double
        String num = scan.nextDouble();
        double numberCubed = Math.pow (num,3);

        //Print the output
        System.out.println("The cube of the number is: " + numberCubed);
    }
}