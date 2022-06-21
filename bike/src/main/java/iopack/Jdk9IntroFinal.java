package iopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Jdk9IntroFinal {

	public static void main(String[] args) {
		File file = new File("applog.txt");
		
     System.out.println(file.getAbsoluteFile());
		
		System.out.println(file.canExecute());
		
		System.out.println(file.exists());
		//try with resources...//IT will use this type is autoclosable..
				try(
						FileReader fis=new FileReader(file);
						FileWriter fos=new FileWriter("newfile.txt");
					){		
					
				char[] b=new char[4];
				int bytesread=0;
				while((bytesread=fis.read(b))!=-1) {
					//String s=new String(b,0,bytesread);
					fos.write(b, 0, bytesread);
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
		
	
	}

}//which classclosable interface is implements we can use try with resources..model
