package iopack;

import java.io.File;
import java.io.IOException;

public class iopack2 {

	public static void main(String[] args) {
    
		File fi=new File("applog.txt");
		
		System.out.println("file name"+fi.getName());
		
		System.out.println(fi.getAbsolutePath());
		
		System.out.println(fi.hashCode());
		System.out.println(fi.isDirectory());
		
		try {
			System.out.println(fi.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
