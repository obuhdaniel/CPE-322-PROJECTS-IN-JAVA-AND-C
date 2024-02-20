//Write a program that obtains a random integer between 34 and 55.


import java.lang.Math;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		double _random = Math.random();
		
		int _result = 34 + (int)(_random * 22);
		
		System.out.print(_result);
	}
}
