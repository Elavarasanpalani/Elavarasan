package iopack;

import java.io.FileInputStream;

public class FileDemoRead1 {

	public static void main(String[] args) {
		try(FileInputStream ss=new FileInputStream("applog.txt");){
			System.out.println(ss.available());
			//System.out.println((char)ss.read());
			
			int value=0;
			
			byte[] b=new byte[10];//byte aray cant read the value of the programme.
			while((value=ss.read(b))!=-1) {
				System.out.println(value);
				String s=new  String(b,0,value);
				System.out.println(s);
				
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
