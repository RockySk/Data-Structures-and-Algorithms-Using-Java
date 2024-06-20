package Section_1_Variables.Practice_Problems;

import java.util.Scanner;

public class Java56_Area_of_square_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the length of a side of the square: ");
        int side = sc.nextInt();


        int area = side * side;
        System.out.println("The area of a square is: " + area);

        sc.close();

    }
}
