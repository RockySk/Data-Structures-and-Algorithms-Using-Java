package Section_3_Conditional_Statements;

import java.util.Scanner;

public class Two_Largest_of_3_Numbers {
    public static void main(String[] args) {
        int A;
        int B;
        int C;

        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        System.out.println("Enter the second number");
        B = sc.nextInt();
        System.out.println("Enter the third number");
        C = sc.nextInt();
       if (A>=B && A>=C) {
           System.out.println("The Largest number is " +A);
       }
       else if(B>=A && B>=C){
           System.out.println("The Largest number is " +B);
       }
       else if(C>=A && C>=B){
           System.out.println("The largest number is " +C);
       }
        sc.close();
    }

}
