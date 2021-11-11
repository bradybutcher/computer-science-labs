
/*
*Program that generates two random numbers between 0 and 100 and prints the greater of the two numbers
*@Brady Butcher
*9/27/21
*/
import java.lang.Math;

public class RandomNumber {
    public static void main(String[] args) {
        // define the range of numbers
        int max = 101;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < 1; i++) {
            // generate random numbers from 1-100
            int rand1 = (int) (Math.random() * range) + min;
            System.out.println("Number 1: " + rand1);
            int rand2 = (int) (Math.random() * range) + min;
            System.out.println("Number 2: " + rand2);

            if (rand1 > rand2) {
                System.out.println(rand1);
            } else {
                System.out.println(rand2);
            }
        }
    }
}