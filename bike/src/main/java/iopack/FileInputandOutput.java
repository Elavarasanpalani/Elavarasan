package iopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputandOutput {

	public static void main(String[] args) {
		File file =new File("applog.txt");
		
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.canExecute());//double click or not this code..
		
		System.out.println(file.exists());//file there or not..
		try {
			FileInputStream  in=new FileInputStream(file );
			FileOutputStream out=new FileOutputStream("newfile.txt"); //it file will be created ..in case file is ther it is override the file
			//if we run this one more time file will be overider
			
			byte[] b=new byte[4];
			int bytesread=0;
			while((bytesread=in.read(b))!=-1) {
				//String s=new  String(b,0,bytesread);
				out.write(b, 0, bytesread);//if you give write not use string object...
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
