package Section_1_Variables;

import java.util.Scanner;

public class Java58_longest_data_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte b = 4;
        char c = 'a';
        short s= 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        int $ = 24;

        System.out.println("the number is:" +$);

        double result = (double) ((f*b) + (i%c) - (d*s));
        System.out.println("the calculated result is: " +result);


    }
}
