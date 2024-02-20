//What is the difference between a constant and a variable? Illustrate with a program
//that finds the area of a circle

import java.util.Scanner;


public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("a program that finds the area of a circle \n");
		
		System.out.println("To get Started enter the Radius of Your Circle, use Enter when done");
		
		double _rad = in.nextDouble();
		
		final double _pi = 3.14159;
		
		double _res = _pi * _rad * _rad;
		
		System.out.print("The Area of the Circle is ");
		
		System.out.print(_res);
		
	}
	
}
