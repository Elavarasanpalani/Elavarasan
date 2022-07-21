package car;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SockertDemo1 {
	public static void main(String[] args) {
		new Server();
	}

}

class Server{
	ServerSocket server;
	Socket client;
	public Server() {
		try {
			server= new ServerSocket(2000);
			System.out.println("sever is redy.....");
			client=server.accept();
			System.out.println(client);
			
			PrintStream our=new PrintStream(client.getOutputStream(),true );
			BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("plese enter a msg client");
			String msg=buff.readLine();
		  our.println(msg);
			
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
			client=new Socket("localhost",2000);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			String msg=br.readLine();
			System.out.println("client is meg to redy to speek server"+msg);
			
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			String  msssg=bf.readLine();
			PrintStream pre=new PrintStream(client.getOutputStream(),true);
			pre.println(pre);
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
	
}
