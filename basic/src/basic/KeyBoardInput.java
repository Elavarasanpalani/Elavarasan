package basic;

import java.util.Scanner;

public class KeyBoardInput {

	public static void main(String[] args) {
		Scanner keyin=new Scanner(System.in);
		
		System.out.println("Enter the name..=");
		
		String name=keyin.next();
		
		System.out.println("Welcome Mr.../Mis...."+name);
		
		System.out.println("Enter the age");
		
		int age =keyin.nextInt();
		
		System.out.println("your age is.."+age);
		
		
		

	}

}
