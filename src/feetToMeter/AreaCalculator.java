package feetToMeter;

public class AreaCalculator {
	
	public AreaCalculator() {
		
	}
	public double area(FeetMeter f1, FeetMeter f2) {
		return f1.toMeter()*f2.toMeter();
	}
}
