package feetToMeter;

import java.util.Scanner;

public class Calculator {
	public static void main (String [] args) {
		// first
		System.out.println("Please enter the first feet =");
		Scanner scanner = new Scanner(System.in);
		double feetInput = scanner.nextDouble();
		System.out.println("The first feet is " + feetInput);
		
		System.out.println("Please enter the first inch =");
		double inchInput = scanner.nextDouble();
		System.out.println("The first inch is " + inchInput);
		
		FeetMeter f = new FeetMeter(feetInput, inchInput);
		System.out.println("The first result is "+ f.toMeter()+" meters.");
		
		// second
		System.out.println("Please enter the second feet =");
		//Scanner scanner2 = new Scanner(System.in);
		double feetInput2 = scanner.nextDouble();
		System.out.println("The second feet is " + feetInput2);
		
		System.out.println("Please enter the second inch =");
		double inchInput2 = scanner.nextDouble();
		System.out.println("The second inch is " + inchInput2);
		
		FeetMeter f2 = new FeetMeter(feetInput2, inchInput2);
		System.out.println("The second result is "+ f2.toMeter()+" meters.");
		
		AreaCalculator a = new AreaCalculator();
		System.out.println("The area is " + a.area(f,f2) + " square meter.");
		
		
		
	}
}
