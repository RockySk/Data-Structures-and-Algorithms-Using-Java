package Section_1_Variables.Practice_Problems;

import java.util.Scanner;

public class Java57_GST_Bill_Practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of Eraser: ");
        float eraser = sc.nextFloat();

        float sum = pen + pencil + eraser;
        System.out.println("The cost of 3 items Bill is: " +sum);


        float gst = (float) (sum * 0.18);
        System.out.println("The  GST price is: " + gst);

        float finalSum = sum+gst;
        System.out.println("The Final Bill including the Price & gst is: " +finalSum);

    }
}

/* shradha way
import java.util.*;
// Bill of Items
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the 3 prices: ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;

        System.out.println("Bill is : " + total);
//Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
        sc.close();
    }
}


 */