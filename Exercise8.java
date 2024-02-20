//Write a program that obtains a random integer between 0 and 999.


import java.lang.Math;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		double _random = Math.random();
		
		int _result = (int)(_random * 1000);
		
		System.out.print(_result);
	}
}
