package utillpac;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> ss=new Stack<String>();
		
		ss.push("ela");
		ss.push("college");
		ss.push("avs");
		
		System.out.println(ss);
		System.out.println(ss.pop());
		System.out.println(ss.pop());//last in first out 

	}

}
