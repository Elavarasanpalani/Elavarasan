package excersies2;

import java.util.Scanner;

public class FloyedPramid1 {

	public static void main(String[] args) {
		int b=0;
		Scanner c=new Scanner(System.in);
		int a=c.nextInt() ;
		
		for(int i=1;i<=a ;i++) {
			for(int j=1;j<i;j++) {
				b++;
				System.out.print(b+"\t");
			}
			System.out.println();
			
		}
		
		
	}

}
