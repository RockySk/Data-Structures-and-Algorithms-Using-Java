package Section_1_Variables.Practice_Problems;

import java.util.Scanner;

public class Java55_Avg_of_N_Numbers_Practice {

    // My Way
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int a = sc.nextInt();

        System.out.println("Enter the Second  number:");
        int b = sc.nextInt();

        System.out.println("Enter the Third number:");
        int c = sc.nextInt();

        int sum  = a+b+c;
        System.out.println("Sum of 3 Numbers A, B, C: "+ sum );
//        System.out.println(sum);

        int avg = sum/3;
        System.out.println("Average of 3 Numbers is : "+ avg) ;
//        System.out.println(avg);

    }
}
/* Shradha Khapra way
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);
        sc.close();
    }
}
*/