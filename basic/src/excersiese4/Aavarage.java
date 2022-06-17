package excersiese4;

import java.util.Scanner;

//import java.util.Scanner;

public class Aavarage {

	public static void main(String[] args) {
		int num = 0;
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the value ..=");
		int i=ch.nextInt();
		
		
		while(i<100) {
			//num=num+i;
			int c=num/i;
			System.out.println("The avarage value..="+c);
			i++;
		}
		//System.out.println(num);
	   
		

	}

}
