
//Experiment 4

import java.util.Scanner;
class Str_palindrome{
    public static void main(String[] args) {
        String str;
        StringBuilder rstr= new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        str=sc.nextLine();
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            rstr.append(str.charAt(i));
        }
        if(str.equals(rstr.toString())){
            System.out.println("String is Palindrome. ");
        }
        else{
            System.out.println("String is not Palindrome. ");
        }

    }
}