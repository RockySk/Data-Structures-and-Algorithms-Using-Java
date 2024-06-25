package Java_DSA_Conditional_Practice;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner sk = new Scanner(System.in);
		
		System.out.println("Check the Leap year : ");
		year = sk.nextInt();
		
		 if (year % 400 == 0){
			System.out.println("This is a leap year");
		 }
		
		else if (year % 100 == 0) {
			System.out.println("This is not a leap year");
		}
		
		else if (year % 4 == 0) {
			System.out.println("This is a leap year");
		}
		 
		else {
            System.out.println("This is not a leap year");
        }
		
		
		
		
		
		sk.close();
		

	}

}
