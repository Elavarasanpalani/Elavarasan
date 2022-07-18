package keywords;

import java.util.Scanner;



public class StrategyDemo3 {
	public static void main(String[] args) {
		Goodfan pan=new Goodfan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("press a jey  and then enter for  pulling cha");
			scan.next();
			pan.pull();
		}
		
	}

}
class Goodfan{
	State state=new Switchoffstate();//associate..
	public void pull(){
		state.pull(this);
	}
	
}
abstract class State{
	public abstract void pull(Goodfan fan); //decalare
		
	

}

class Switchoffstate extends State{

	@Override
	public void pull(Goodfan fan) {
		System.out.println("switch off state....");
		fan.state=new Switchonstate();
		
		
	}
	
}
class Switchonstate extends State{

	@Override
	public void pull(Goodfan fan){
		System.out.println("swithch on state...");
		fan.state=new MediumSpeedState();
		
	}
	
}
class MediumSpeedState extends State{

	@Override
	public void pull(Goodfan fan) {
		System.out.println("medium speed state....");
		fan.state=new Highspeed();
		
	}
	
}
class Highspeed extends  State{

	@Override
	public void pull(Goodfan fan) {	
		System.out.println("high speed......");
		fan.state=new Switchoffstate();
		
	}
	
}
class badfan{
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("siwthc on state..");
			state =1;
		}
		else if(state==1) {
			System.out.println("medium fast...");
			state=2;
		}
		else if(state==2) {
			System.out.println("hight fast......");
			state=3;
		}
		else if(state==3) {
			System.out.println("swithc off");
			state=0;
		}
	}
}
