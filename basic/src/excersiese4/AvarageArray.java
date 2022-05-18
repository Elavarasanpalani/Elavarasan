package excersiese4;

import java.util.Scanner;

public class AvarageArray {

	public static void main(String[] args) {                                           
		System.out.println("Enter the length.."); 
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the vlaue..");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}	

		int sum=0;
	System.out.println("the vlaue are ..");
		for(int j=0;j<n;j++) {
		System.out.println(a[j]);
		
			sum=sum+a[j];
		}
		System.out.println("the avarage value.."+sum/n);

	}
	}


