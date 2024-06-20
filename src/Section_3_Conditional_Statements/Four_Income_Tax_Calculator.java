package Section_3_Conditional_Statements;

import java.util.Scanner;

public class Four_Income_Tax_Calculator {
    public static void main(String[] args) {
        int income;
        int tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the income: ");
        income = input.nextInt();
        if (income <=500000){
        tax = 0;
            System.out.println("No tax applicable: " + tax);
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
            System.out.println("20% tax applicable: " + tax);
        }
        else if (income >=1000000){
            tax = (int) (income * 0.3);
            System.out.println("30% tax applicable: " + tax);
        }
        input.close();
    }
}
