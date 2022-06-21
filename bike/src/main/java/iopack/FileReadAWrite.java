package iopack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadAWrite {

	public static void main(String[] args) {
		File file=new File("applog.txt");
		FileReader fis=null;
		FileWriter fos=null;//because lock outsaid the finaly  so we put the file reade here..
		
		//new chareter inter write a class we compersolly closs the conncetion 
		try {
			 fis=new FileReader(file);
			 fos=new FileWriter("newfile.txt"); //this one is support char reading
			char[] b=new char[4];
			int bytesread=0;
			while((bytesread=fis.read(b))!=-1) {
				//String s=new String(b,0,bytesread);
				fos.write(b, 0, bytesread);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//it allways  get call..excption and array or not..
			try {
				fos.close(); ///it will compercely close the connection...//it also cheked exception 
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
		}
	}

}
//it is bigg coad so jdk 9 is intertuse something ..