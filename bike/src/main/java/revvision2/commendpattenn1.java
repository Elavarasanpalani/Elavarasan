package revvision2;

public class commendpattenn1 {
	public static void main(String[] args) {
		univecelremote.useRemote();
		
	
	}
	class univecelremote{
		public static void useRemote() {
			System.out.println("Demostration of remoter......");
			
			Tv tv=new  Tv();
			netfix net=new netfix();
			settobox set=new settobox();
			soundsystem sound=new soundsystem();
			
			father fa=new father(tv, set, sound, net);
			motherserial mos=new motherserial(tv, set, sound, net);
			matheroldmovie old=new matheroldmovie(tv, set, sound, net);
			
			remote universel=new remote();
			universel.executeCommend(1);
			universel.setCommend(fa, 0);
			universel.setCommend(mos, 1);
			System.out.println("father went to sen nuew ..");
			universel.equals(0);
		}
	}
	
	

}
class netfix{
	public void movieold() {
		System.out.println("old movides statered...");
	}
}
class Tv{
	public void av1() {
		System.out.println("tv switch to av mode... ");
	}
	public void swithcon() {
		System.out.println("swithc on mode is stated");
		
	}
}
class settobox{
	public void newschennal() {
		System.out.println("news chanal is stated...");
	}
	public void serialchennal() {
		System.out.println("serial cchennal is stared....");
	}
}

class soundsystem{
	public void lowsound() {
		System.out.println("sound oludme decrese....");
	}
}
interface commend{
	public void excequte();
}

class motherserial implements commend{
	Tv tv; settobox set; soundsystem sound; netfix net;
	public motherserial(Tv tv, settobox set, soundsystem sound, netfix net) {
		this .tv=tv;
		this.set=set;
		this.sound=sound;
		this.net=net;
	
	}

	

	@Override
	public void excequte() {
		System.out.println("mother is start with serial...");
		tv.av1();
		tv.swithcon();
		net.movieold();
		set.newschennal();
		set.serialchennal();
		sound.lowsound();
		System.out.println("dad enjpy the news channel....");
	}
	
}
class father implements commend{
	Tv tv; settobox set; soundsystem sound; netfix net;
	public father(Tv tv, settobox set, soundsystem sound, netfix net) {
		this .tv=tv;
		this.set=set;
		this.sound=sound;
		this.net=net;
	
	}

	@Override
	public void excequte() {
		System.out.println("father tv action start..");
		tv.av1();
		tv.swithcon();
		net.movieold();
		set.newschennal();
		set.serialchennal();
		sound.lowsound();
		System.out.println("dad enjpy the news channel....");
		
		
		
	}
	
}
class matheroldmovie implements commend{
	Tv tv; settobox set; soundsystem sound; netfix net;
	public matheroldmovie(Tv tv, settobox set, soundsystem sound, netfix net) {
		this .tv=tv;
		this.set=set;
		this.sound=sound;
		this.net=net;
	
	}

	@Override
	public void excequte() {
		System.out.println("mom start with old movies.....");
		tv.av1();
		tv.swithcon();
		net.movieold();
		set.newschennal();
		set.serialchennal();
		sound.lowsound();
		System.out.println("mom enjoy with old movies...");
	}
	
}
class Dummy implements commend{

	@Override
	public void excequte() {
		System.out.println("dummy commend is startes...");
		
	}
	
}
class remote{
	commend[] comments=new commend[5];
	public remote() {
		for(int i=0;i<comments.length;i++) {
			
		}
		
	}
	
	
	
	
}
