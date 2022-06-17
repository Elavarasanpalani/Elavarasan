package utillpac;

import java.util.StringTokenizer;

public class StringDemo1 {

	public static void main(String[] args) {
		StringTokenizer ss=new StringTokenizer("my nama is ela");//String Tokenizer can read token by token
		while(ss.hasMoreTokens()) {
			System.out.println(ss.nextToken());
		}
		

	}

}
