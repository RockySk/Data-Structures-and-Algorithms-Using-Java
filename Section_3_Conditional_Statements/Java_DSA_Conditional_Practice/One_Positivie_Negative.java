package Java_DSA_Conditional_Practice;

import java.util.Scanner;

public class One_Positivie_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		
		System.out.println("Enter the Number of your Choice: ");
		A = sc.nextInt();	
		if (A>=0) {
			System.out.println("The Number is Positive");
		}
		else if (A<=0) {
			System.out.println("The Number is Negative");
		}
		else if (A==0){
			System.out.println("The Number is Zero");
		}
		
		sc.close();
		
	}

}
