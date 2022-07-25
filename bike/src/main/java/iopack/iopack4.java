package iopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iopack4 {

	public static void main(String[] args) throws Exception {
		
		
		try {
			FileInputStream fis=new FileInputStream("applog.txt");
			
			FileOutputStream fio=new FileOutputStream("myfile.txt");
			
			int bytes=0;
			byte[] b=new byte[4];
			
			while((bytes=fis.read(b))!=-1) {
				fio.write(bytes);
			}
			fis.close();
			fio.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
