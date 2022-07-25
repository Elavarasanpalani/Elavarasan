package test2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Filepro {

	public static void main(String[] args) {
		try {
			BufferedReader bff=new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//elavarasan.p//image/lang.txt")));
		//	FileOutputStream fi=new FileOutputStream("C:\\Users\\elavarasan.p\\image\\lang.txt");
		
	     String line;
	    
			while((line=bff.readLine())!=null) {
				 System.out.print(line);
			 }
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
