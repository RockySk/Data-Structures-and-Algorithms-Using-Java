package Section_3_Conditional_Statements;

import java.util.Scanner;

public class Seven_Switch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Enter the number: \n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1: System.out.println("Lenovo Legion");
                break;
            case 2: System.out.println("HP Pavilion");
                break;
            case 3: System.out.println("Asus ROG");
                break;
            default: System.out.println("None of the above");
        }
        sc.close();

    }

}