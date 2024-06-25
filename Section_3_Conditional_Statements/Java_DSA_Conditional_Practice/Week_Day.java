package Java_DSA_Conditional_Practice;

import java.util.Scanner;

public class Week_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sk = new Scanner(System.in);
		
		int week;
		
		System.out.println("Enter the week number of your choice: ");
		week = sk.nextInt();
		
		switch(week) {
		case 1: 
			System.out.println("Monday");
		break;
		
		case 2: 
			System.out.println("Tuesday");
		break;
		
		case 3: 
			System.out.println("Wednesday");
		break;
		
		case 4: 
			System.out.println("Thursday");
		break;
		
		case 5: 
			System.out.println("Friday");
		break;
		
		case 6: 
			System.out.println("Saturday");
		break;
		
		case 7: 
			System.out.println("Sunday");
		break;

		default: 
			System.out.println("Choice is invalid");
		}
		
		
		sk.close();

	}

}
