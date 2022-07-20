
//Experiment 7

import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        String s;
        StringBuilder r= new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        int n=s.length();
        for(int i=n-1;i>=0;i--) {
            r.append(s.charAt(i));
        }
        System.out.println(r);
    }

}
