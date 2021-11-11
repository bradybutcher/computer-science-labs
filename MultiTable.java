import java.util.*;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        /*Initialize Variables*/
        int amax = scan.nextInt();
        int bmax = scan.nextInt();

        System.out.print("x" + " |" + " ");
        
        for (int b = 1; b <= bmax; b++) { //Top row number
            System.out.print(b + "  ");
        }
        System.out.println();

        for (int b = 1; b <= bmax; b++) { //Divider
            System.out.print("____");
        }
        System.out.println();
        for (int a = 1; a <= amax; a++) {
            System.out.print(a + " |" + " ");
            for (int b = 1; b <= bmax; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }
    }
}