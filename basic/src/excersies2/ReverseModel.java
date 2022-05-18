package excersies2;

import java.util.Scanner;

public class ReverseModel {

	public static void main(String[] args) {
		int num=0;
		int reverse=0;
		System.out.println("This is revers of two number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		
		System.out.println("The value of the reverse process of the model="+reverse);
		
		
	}

}
