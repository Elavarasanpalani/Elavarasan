package iopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//io concept we can be use to fast process on the perpose

public class FileDemoRead {
	
	//biyt Strem..
	//charecter strem..
	//new io

	public static void main(String[] args) {
	 try( FileInputStream fd=new FileInputStream("applog.txt");) {
//		
        	 System.out.println(fd.available());
        	// System.out.println(fd.getChannel());
        	// System.out.println(fd.skip(7));
//		 System.out.println((char)fd.read());//once it was read  the curscre is move next line..
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//		 System.out.println((char)fd.read());
//
//		 System.out.println((char)fd.read());
        	 System.out.println();
        	 
//        	 int available=fd.available();
//        	 
//        	 byte b[]=new byte[available];//less file ok for that but 1gp and 2 gp file is not ok for the array  is faild ....
//        	 fd.read(b);
//        	 System.out.println(fd.available());
//        	 String s=new String(b,0,available);
//        	 System.out.println(s);
//		
//		 
        	 byte b[]=new byte[10];//if the bytr arry use to divide fo 4 of 4 it chouse our self..
        	// System.out.println();
        	 int ela=0;
        	 while((ela=fd.read(b))!=-1){ //when we hava -1 that we read the program
        		 System.out.println(ela);
        		 String s=new String(b,0,ela);
        		 System.out.println(s);
        		 
        	 }


		 
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 
	 
		

	}


}
