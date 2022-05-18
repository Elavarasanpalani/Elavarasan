package excersies2;

import java.util.Scanner;

public class FloyedPramid {

	public static void main(String[] args) {
		
		int b=0;
		System.out.println("The program is run...");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//System.out.println("The program is run...");
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				
				b++;
				System.out.print(b+" ");
			}
		System.out.println();	
		}
	}

}
