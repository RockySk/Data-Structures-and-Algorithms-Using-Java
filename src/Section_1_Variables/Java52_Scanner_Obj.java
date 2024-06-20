package Section_1_Variables;

import java.util.Scanner;

public class Java52_Scanner_Obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of area of circle: ");
        float rad = sc.nextFloat();

        float area = 3.14f * rad * rad;
        System.out.println("The entered result is: " +area);
    }
}
