package excersies;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner num =new Scanner(System.in);
		
		int num1;
		System.out.println("the vlaue of odd or even...");
		num1=num.nextInt();
		
		
		
		if(num1%2==0) {
			System.out.println("the vlaue is even"+num1);
		}
		else
		{
			System.out.println("this vlaue is odd"+num1);
		}
		

	}

}
