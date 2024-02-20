//Write a program that computes the distance between any two points (x1, y1) and (x2, y2)


import java.util.Scanner;
import java.lang.Math;
public class Exerise4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("a program that computes the distance between any two points (x1, y1) and (x2, y2)");
		
		System.out.print("\nx1: ");
		
		int _x1 = input.nextInt();
		
		System.out.print("\ny1: ");
		
		int _y1 = input.nextInt();
		
		System.out.print("\nx2: ");
		
		int _x2 = input.nextInt();
		
		System.out.print("\ny2: ");
		
		int _y2 = input.nextInt();
		
		
		System.out.print("\nDistance between ("+ _x1 +", " + _y1 + ") and  ("+ _x2 + ", " + _y2 + ") is " );
		
		int _deltaX = _x2 - _x1;
		
		int _deltaY = _y2 - _y1;
		
		double _deltaXSquare = Math.pow(_deltaX, 2);
		
		double _deltaYSquare = Math.pow(_deltaY, 2);
		
		double _sumDeltaXY = _deltaXSquare + _deltaYSquare;
		
		double _finalResult = Math.pow(_sumDeltaXY, 0.5);
		
		System.out.print(_finalResult);
		

		
		
		
	
	
	
	}
}
