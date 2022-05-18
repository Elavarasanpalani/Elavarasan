package excersies2;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		while(num<10) {
			b=b+num;
			num++;
			
		}
		System.out.println(b);
	
	}

}
