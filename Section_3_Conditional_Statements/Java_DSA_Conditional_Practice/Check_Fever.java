package Java_DSA_Conditional_Practice;

import java.util.Scanner;

public class Check_Fever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		double temp;
		
		System.out.println("Enter the Fever Temperature: ");
		temp = sc.nextDouble();
		
		if (temp > 100) {
			System.out.println("You have fever");
			
		}
		
		else if (temp < 100) {
			System.out.println("You don't have fever");
			
		}
		
		else {
			System.out.println("You're jsut joking");
		}
		
		sc.close();;

	}

}
