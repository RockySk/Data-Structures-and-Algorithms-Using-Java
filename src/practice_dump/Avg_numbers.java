package practice_dump;

import java.util.Scanner;

public class Avg_numbers
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the 3 Numbers: "+a+", "+b+", "+c);

//        int number = sc.nextInt();
//        int sum = number+number+number;
        int sum = a+b+c;
        System.out.println("the total sum of 3 numbers: " +sum);

        int avg = sum/3;
        System.out.println("The avg of 3 numbers: " +avg);

sc.close();
    }
}
