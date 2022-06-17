package excersies2;

import java.util.Scanner;

public class OnesideTriangle {

	public static void main(String[] args) {
		Scanner th=new Scanner(System.in);
		System.out.println("Enter the number...=");
		int ch=th .nextInt();
		
		for(int i=1;i<=ch;i++) {
			for(int j=ch;j>i;j--) {
				System.out.print(" ");
			}
			int j = i;
			for(int k=0;k<j;k++) {
				System.out.print(  " *");
			}
			System.out.println();
		}
				
		
		
		
	}

}
