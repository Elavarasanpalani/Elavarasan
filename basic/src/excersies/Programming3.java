package excersies;
//. Multiply Two Numbers.

import java.util.Scanner;

public class Programming3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);// storing the value 
		
		System.out.println("enter the value i=..");
		int i,j;
		i=s.nextInt();//  get the value
		j=s.nextInt();
		String arm;
		arm=s.next();
		System.out.println(i+"..."+j);
		System.out.println(arm);
		
		int k=i*j;
		System.out.println("the multiple vlaue of this programming..="+k);
		
		
		

	}

}
