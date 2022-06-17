package excersiese4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner array=new Scanner(System.in);
		
		int a[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			
			a[i]=array.nextInt();
			sum=sum+a[i];
			
			
		}
		System.out.println(sum);
		
		
	
		
		

	}

}
