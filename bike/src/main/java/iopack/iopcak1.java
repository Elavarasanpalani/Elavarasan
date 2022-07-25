package iopack;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class iopcak1 {

	public static void main(String[] args) throws Exception {
		
		try {
			FileInputStream fis=new FileInputStream("applog.txt");///file input eduthachi
			
			BufferedInputStream buff=new BufferedInputStream(fis);
			
			int bytees;
			
			byte b[]=new byte[4];
			
			while((bytees=buff.read(b))!=-1) {
				System.out.println((char)bytees);
				
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
