package excersies;

import java.util.Scanner;

public class Vowels {


	public static void main(String[] args) {
	
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("the vlau of vowle");
		String ch=n.nextLine();
		
		
		String[] a1 = {"a","o","i","e","u"};
	/*	String a2="e";
		String a3="i";
		String a4="o";
		String a5="u"; */
		
		
		if(ch==a1[0] || ch==a1[1] || ch==a1[2] || ch ==a1[3] || ch==a1[4]) {
			
			System.out.println(ch+" this is vowel");
			
		}
		else {
			System.out.println( ch+"  This is not vowel");
		}
		}
	}


