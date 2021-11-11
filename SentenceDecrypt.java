
/**
 * Program that reads an encrypted sentence from the keyboard so that the message consists of only the first five characters with even-numbered indexes, all other characters are discarded. Decrypts the message and outputs the result
 *
 *
 * @Brady Butcher
 * @9/23/21
 */
import java.util.*;

public class SentenceDecrypt {
    public static void main(String[] args) {
        // initializes a scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an encrypted message");
        String message = scan.next();

        char letterH = message.charAt(0);
        char letterE = message.charAt(2);
        char letterL = message.charAt(4);
        char letterL2 = message.charAt(6);
        char letterO = message.charAt(8);

        System.out.print(letterH);
        System.out.print(letterE);
        System.out.print(letterL);
        System.out.print(letterL2);
        System.out.print(letterO);

    }
}
