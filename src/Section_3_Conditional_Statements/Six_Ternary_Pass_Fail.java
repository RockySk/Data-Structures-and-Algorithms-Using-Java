package Section_3_Conditional_Statements;

import java.util.Scanner;

public class Six_Ternary_Pass_Fail {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of the Student: ");
        int result = sc.nextInt();

        String Type = (result >= 33? "Pass" : "Fail");

        System.out.println("The Result is: " + Type);
    }
}
