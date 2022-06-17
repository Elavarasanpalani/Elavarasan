package excersiese4;

import java.util.Scanner;

public class AvarageaNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		
		int size = sc.nextInt();
		//System.out.println(size);
		
		int n[]=new int[size];
		int sum=0;
	  
	   for(int i=0;i<size;i++) {
		   	n[i]=sc.nextInt();
		   	
		   //	System.out.println(n[i]);
		   	sum=sum+n[i];
		   		

		   	
	   }
	        System.out.println("The average value ..."+sum/size);
		}
		
		

	}


