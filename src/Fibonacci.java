
//Experiment 2

import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        int fib=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. to find Fibonacci of: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            fib=fib+i;
            System.out.println(fib);
        }

    }
}