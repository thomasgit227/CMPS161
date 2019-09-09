package chapterTwo;
import java.util.Scanner;
/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 4, 2019
 * 
 * Summary: 
 * A Scanner will gather information from the user to find the volume of a user-specified shape.
 * The Final volume is returned at the end of the prompt.
 */

public class ComputeVolume {
	
	private final double PI = Math.PI;
	private String = "";
	private double result = 0;
	
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		
		
	}
	public ComputeVolume() {
		
	}
	
	
	public ComputeVolume(double radius) {
		result = (1.333333) * PI * Math.pow(radius, 3);
	}
	
	public ComputeVolume(double bottomRadius, double height, boolean isCone) {
		double area = PI * Math.pow(bottomRadius, 2);
		
		if(isCone) {
			result = area * (height / 3);
		}
		else {
			result = area * height;
		}
	}
	
	public ComputeVolume(double height, double width, double legnth) {
		result = height * width * legnth;
	}
	
	public double getVolume() {
		return result;
	}
}
