package excersiese4;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i,count=0;
		Scanner th=new Scanner(System.in);
		System.out.println("Enter the prime num.....=");
	     int num=th.nextInt();	
	     
	     for(i=2;i<num;i++) {
	    	 if(num%i==0) {
	    		 count++;
	    		 break;
	    	 }
	     }
	    	 
	    	 if(count==0) {
	    		 System.out.println("this is prime num");
	    	 }
	    	 else {
	    		 System.out.println("this is not prime num");
	    	 }
	     }

	}


