package Section_1_Variables;

import java.util.Scanner;

public class Java4_Var_next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        System.out.println(input);

//        String name = sc.nextLine();
//        System.out.println(name);

//        int number = sc.nextInt();
//        System.out.println(number);

//          byte number = sc.nextByte();
//          System.out.println(number); // main differences between byte and int are their range, memory allocation,byte is used for smaller integers to conserve memory, while int is used for general-purpose integer arithmetic and variables

//            float number = sc.nextFloat();
//        System.out.println(number);
//
//        double number = sc.nextDouble();
//        System.out.println(number); //-1.278, -256.125, 10.1

//        boolean badami= sc.hasNextBoolean();
//        System.out.println(badami);

        short number = sc.nextShort();
        System.out.println(number);

        long num = sc.nextLong();
        System.out.println(num);


    }
}
