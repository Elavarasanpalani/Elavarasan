package excersies2;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Area of circle programing in java language claculation");
		
		double ela=sr.nextDouble();
		
		double area = Math.PI * (ela * ela);
		
		double circle=area;
		System.out.println("the vlaue of circle.."+circle);
		
		double circumfrence=Math.PI *2*ela;
		System.out.println("The valu of circumfrefcnce of the programming java language"+circumfrence);
	
	}

}
