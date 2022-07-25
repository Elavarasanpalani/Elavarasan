package iopack;

import java.io.File;

public class iopack3 {

	public static void main(String[] args) {
		
    String dirname="/ela";
    
    
//    File file=new File(dirname);
//    System.out.println(file.getAbsolutePath());
//    
   // System.out.println(file.isDirectory());
    
//    if(file.isDirectory()) {
//    	String s[]=file.list();//list file return  to the array list object...
//    	for(int i=0;i<s.length;i++) {
//    		System.out.println(s[i]);
//    	}
//    }
    
    File file=new File(dirname);//it is list of file return an set of  string objct....
    
    if(file.isDirectory()) {
    	String s[]=file.list();
    	for(int i=0;i<s.length;i++) {
    		System.out.println(s[i]);
    	}
    	
    }
    
    
    
	}

}
