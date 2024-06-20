package Section_1_Variables;

import java.util.Scanner;

public class Java5_Scanner_Obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The result is :"+sum);

        // Wait for user input before exiting
        System.out.println("Press Enter to exit.");
        sc.nextLine(); // Consume newline character
        sc.nextLine(); // Wait for user input

        sc.close();
    }
}
