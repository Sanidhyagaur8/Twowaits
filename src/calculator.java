
//Experiment 1

import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the no of choice of Operation: ");
        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Square 6.Cube 7.Table 8.All 9.Exit" );
        int no=sc.nextInt();
        switch (no){
            case 1:
                System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of "+a+" and "+ b +" is "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of "+a+" and "+ b +" is "+(a*b));
                break;
            case 4:
                System.out.println("Division of "+a+" and "+ b +" is "+(a/b));
                break;
            case 5:
                System.out.println("Square of "+a+" is "+(a*a));
                System.out.println("Square of "+b+" is "+(b*b));
                break;
            case 6:
                System.out.println("Cube of "+a+" is "+(a*a*a));
                System.out.println("Cube of "+b+" is "+(b*b*b));
                break;
            case 7:
                for(int i=1;i<=b;i++){
                    int sum=a*i;
                    System.out.println("Table of "+a+" till "+b+" is "+sum);
                }
                break;
            case 8:
                System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
                System.out.println("Subtraction of "+a+" and "+ b +" is "+(a-b));
                System.out.println("Multiplication of "+a+" and "+ b +" is "+(a*b));
                System.out.println("Division of "+a+" and "+ b +" is "+(a/b));
                System.out.println("Square of "+a+" is "+(a*a));
                System.out.println("Square of "+b+" is "+(b*b));
                System.out.println("Cube of "+a+" is "+(a*a*a));
                System.out.println("Cube of "+b+" is "+(b*b*b));
                for(int i=1;i<=b;i++){
                    int sum=a*i;
                    System.out.println("Table of "+a+" till "+b+" is "+sum);
                }
                break;
            case 9:
                System.out.println("Exiting");
                return;
            default:
                System.out.println("Wrong choice made ");



        }
    }
}
