package sockert;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JackandJill {
	public static void main(String[] args) throws Exception {
		String sql="Jack @amp; Jill  went up the &copy hill";
		
		ByteArrayInputStream  bis=new ByteArrayInputStream(sql.getBytes());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(bis));
		
		int n=0;
		boolean mark=false;
		while((n=br.read())!=-1) {
			char c=(char)n;
			switch(c) {
			case '@':{
				br.mark(32);
				mark=true;
				break;
			}
			case ';':{
				System.out.println("&");
				mark=false;
				break;
			}
			case ' ':{
				if(mark) {
					br.reset();
					System.out.println("@");
					mark =false;
				}
				else {
					System.out.println("");
				}
				break;
			}
			default:{
				if(!mark) {
					System.out.println(c);
				}
			}
			}
			
		}
	}

}
