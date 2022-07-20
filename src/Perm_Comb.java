
//Experiment 5

import java.util.Scanner;
class fac{
    int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

}
public class Perm_Comb extends fac{
    public static void main(String[] args) {
        fac fc=new fac();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second nummber: ");
        int b=sc.nextInt();
        int p= fc.factorial(a)/fc.factorial(a-b);
        int c= fc.factorial(a)/(fc.factorial(a-b) * fc.factorial(b));
        System.out.println("Permutaion is "+p);
        System.out.println("Combination is "+c);

    }
}
