//There is another way to write our second program but with a third variable involved
//and achieving the same result, how can this be done? Implement your answer in a
//program

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your First Second and Third Values seperated by Enter ");
		
		int val1 = input.nextInt();
		int val2 = input.nextInt();
		int val3 = input.nextInt();
		
		int res = val1 + val2 + val3;
		
		System.out.println("Your answer is ");
		System.out.println(res);
		
	}
}
