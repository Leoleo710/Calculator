package feetToMeter;

public class FeetMeter {
	double feet;
	double inch;

	public FeetMeter (double feet,double inch){
		this.feet = feet;
		this.inch = inch;
	}
	public double getFeet() {
		return feet;
	}
	
	public double getInch() {
		return inch;
	}
	
	public double toMeter() {
		return (getFeet()*12+getInch())*2.54/100;
	}
	
}
