package sockert;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemo {

	public static void main(String[] args) {
		new Server();
		

	}

}
class Server{
	ServerSocket server;
	Socket client;
	public Server() {
		try {
			server=new ServerSocket(4000);//port it is address.......... it is 
			while(true) {
			System.out.println("server ready to accept...");
		client=	server.accept(); //it is accept...
		System.out.println(client);
		
	PrintStream pre=new PrintStream(client.getOutputStream(),true);//print strme is stored to the getoutputstre
	BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("plese enter a mesg to client");
	String msg=brr.readLine();
	 pre.println(msg);//it will print client....
	
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
	
}
class Client{
	Socket client;
	public Client() {
		try {
			while(true) {
				
			
			client=new Socket("localhost",4000);
			
			BufferedReader bis=new BufferedReader(new InputStreamReader(client.getInputStream()));//bufferinput strem canot readline...
			
			String msgserver=bis.readLine();//readline methe d red  to string 
			System.out.println("massage for server.."+msgserver);
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("plese enter massage toserver..");
			String msg =bf.readLine();
			PrintStream prei=new PrintStream(client.getOutputStream(),true);
			prei.println(msg);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Client();
	}
	
	
}
