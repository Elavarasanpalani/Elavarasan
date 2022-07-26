package re;

public class com {
	
	

}
class unive{
	public static void  remo() {
		TV tv=new TV();
		netfix net=new netfix();
		
		
		
		father fa=new father(tv, net)
				
				
				
				
	}
}

interface Comment{
	public void excequte();
}

class TV{
	public void ac1() {
		System.out.println("av is stateddd");
	}
	
	public void movie() {
		System.out.println("mobies is statedd,,,,,");
	}
}

class netfix{
	public void hollywood() {
		System.out.println("hollouis starddd");
	}
}


class father implements Comment{
	
	TV tv; netfix net;
	public father(TV tv,netfix net) {
		this. tv=tv;
		this. net=net;
	}
	@Override
	public void excequte() {
		
		tv.ac1();
		tv.movie();
		net.hollywood();
	}
}

class mother implements Comment{
	TV tv; netfix net;
	public mother(TV tv,netfix net) {
		this. tv=tv;
		this. net=net;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excequte() {
		tv.ac1();
		tv.movie();
		net.hollywood();
		
	}
}

class dummy implements Comment{

	@Override
	public void excequte() {
		System.out.println("dummy is work");
	}
	
}

class Remote{
	Comment com[]=new Comment[5];
	public Remote() {
		for(int i=0;i<com.length;i++) {
			com[i]=new dummy();
			
		}
		
		public void setComment(Comment com,int slot) {
		this.com[slot]	=com;
		}
		public void excequteCommet(int slot) {
			com[slot].excequte();
		}
	}
	
}
	
	