package Section_3_Conditional_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Three_Even_Odd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();

        if(n%2==0){
            System.out.println("The number is even ");

        }
        if(n%2!=0){
            System.out.println("The number is odd ");
        }
        sc.close();
    }
}
