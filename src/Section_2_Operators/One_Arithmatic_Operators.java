package Section_2_Operators;

import java.util.Scanner;

public class One_Arithmatic_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 Numbers:") ;

        int A = sc.nextInt();
        int B = sc.nextInt();

        int add = A+B;
        int sub = A-B;
        int mul = A*B;
        int div = A/B;
        int mod = A%B;

        System.out.println("Arithmetic Addition: " +add);
        System.out.println("Arithmetic Subtraction: " +sub);
        System.out.println("Arithmetic Multiplication: " +mul);
        System.out.println("Arithmetic Division: " +div);
        System.out.println("Arithmetic Modulus: " +mod);

        sc.close();

    }
}
