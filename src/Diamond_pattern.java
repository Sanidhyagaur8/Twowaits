
//Experiment 6

import java.util.Scanner;
public class Diamond_pattern{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines in half diamond pattern: ");
        int number =sc.nextInt();
        int m, n;
        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

