//Write a program that converts π / 8 to an angle in degrees and assigns the result to a variable.

import java.lang.Math;

public class Exercise6 {
	
	
	public static void main(String[] args) {
		System.out.println("\nA program for converting π / 8 to an angle in degrees");
		
		
		double _radian = Math.toDegrees(Math.PI/8);
		
		System.out.print("\nConverting π / 8 to an angle in degrees give "+ _radian + " degrees");
		
	}
}
