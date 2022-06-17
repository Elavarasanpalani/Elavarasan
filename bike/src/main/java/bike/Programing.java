package bike;

import java.util.Scanner;

public class Programing {

	public static void main(String[] args) {
		Scanner ch =new Scanner(System.in);
		System.out.println("Enter the mark..=");
		int num=ch.nextInt();
				
		if(num>90) {
			System.out.println("very good");
			}
		else if(num>80 || num<90){
			System.out.println("good");
			
		}
		else if(num>70 && num<80) {
			System.out.println("avarage");
		}
		else if(num>60 && num<70) {
			System.out.println("Bello avarage");
		}
		else if (num>50 && num<60) {
			System.out.println("low mark");
		}
		

	}

}
