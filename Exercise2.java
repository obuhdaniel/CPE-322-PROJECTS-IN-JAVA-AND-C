//Write a program to compute the average of three numbers entered by a user, take
//note to include the right datatype for the variable containing the expected result.
//Display the result on the console

import java.util.Scanner;


public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a program to compute the average of 3 numbers");
		
		System.out.println("Enter your First Second and Third Values seperated by Enter ");
		
		int val1 = input.nextInt();
		int val2 = input.nextInt();
		int val3 = input.nextInt();
		
		int res = val1 + val2 + val3;
		
		double avg = res/3;
		
		System.out.println("Your answer is ");
		System.out.println(avg);
		
		
		
	}
	
	
}
