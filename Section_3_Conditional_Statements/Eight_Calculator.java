package Java_DSA;

import java.util.Scanner;

public class Eight_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();

        System.out.println("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Enter Operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println(a+b);
            break;

            case '-' : System.out.println(a-b);
                break;

            case '*' : System.out.println(a*b);
                break;

            case '/' : System.out.println(a/b);
                break;

            case '%' : System.out.println(a%b);
                break;

            default: System.out.println("You have entered a wrong input choice");
        }
        sc.close();

    }
}
