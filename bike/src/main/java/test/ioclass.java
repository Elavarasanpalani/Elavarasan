package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ioclass {

	public static void main(String[] args) {
		URLConnection con;
		try {
			
			URL url=new URL("http://www.google.com/index.html");
			
			con=url.openConnection();
			
//			BufferedInputStream buff=new BufferedInputStream(con.getInputStream());
//			FileOutputStream fo=new FileOutputStream("new.html");
			BufferedReader fr=new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter sw=new FileWriter("nee.html");
			
			char[] b=new char[127];
			int bytees=0;
			
			while((bytees=fr.read(b))!=-1) {
				sw.write(b,0,bytees);
			}
			
			
//			byte []b=new byte[128];
//			int bytes=0;
//			while((bytes=buff.read(b))!=-1) {
//				fo.write(b,0,bytes);
//				
//			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
