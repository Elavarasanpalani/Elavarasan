package genaric;

import java.util.StringTokenizer;

public class StrinTocn {

	public static void main(String[] args) {
		StringTokenizer ss=new StringTokenizer("my name is elavarasan");
		while(ss.hasMoreTokens());{
			//String s=ss.nextToken();
			System.out.println(ss.nextToken());
		}

	}

}
