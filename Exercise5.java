//Write a program that converts 54 degrees to radians and assigns the result to a variable.

import java.lang.Math;


public class Exercise5 {
	
	public static void main(String[] args) {
		
		int _degree = 54;
		
		double _radian = Math.toDegrees(_degree);
		
		System.out.println( _degree + " in degrees is equivalent to  " + _radian + " in radian ");
	}
}
