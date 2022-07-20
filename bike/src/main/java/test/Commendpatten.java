package test;

public class Commendpatten {
	public static void main(String[] args) {
		Universel.remote();
	}

}
class Universel{
	public static void remote() {
		netfix net=new netfix();
		TV tv=new TV();
		setofbox set=new setofbox();
		
		Father fa=new Father(net);
		Mother mom=new Mother( tv);
		child ch=new child(set);
		
		Remote remo=new Remote();
		//remo.excequtecomment(0);
		remo.setComment(fa, 1);
		//remo.excequtecomment(1);
		remo.setComment(mom, 2);
		remo.setComment(ch, 3);
		//remo.excequtecomment(3);
		remo.excequtecomment(2);
		
	}
}

class netfix{
	public void hollywoodmovie() {
		System.out.println("hollywoodmovies is started....");
	}
	public void wwf() {
		System.out.println("wwf  is started......");
	}
}
class TV{
	public void serialchannel() {
		System.out.println("seial is started....");
	}
	public void oldmoviechannel() {
		System.out.println("old movies is started....");
	}
}
class setofbox{
	public void cartoons() {
		System.out.println("cartoons is started.....");
	}
	public void tatasky() {
		System.out.println("tatasky set is startedd....");
	}
}
interface comment{
	public void excequte();

	
}
class Father implements comment{
	netfix net;
	public Father(netfix net) {
		this.net=net;
//		this.set=set;
//		this.tv=tv;
//		
		
	}
	

	@Override
	public void excequte() {
		System.out.println("father start movies.......");
		net.hollywoodmovie();
		net.wwf();
//		set.cartoons();
//		set.tatasky();
//		tv.oldmoviechannel();
//		tv.serialchannel();
		System.out.println("father enjoy the movies.........");
		
		
	}
	
}
class Mother implements comment{
	TV tv; 
	public Mother(TV tv) {
//		this.net=net;
//		this.set=set;
		this.tv=tv;
		
	}

	@Override
	public void excequte() {
		System.out.println("mother started serialsss.....");
//		net.hollywoodmovie();
//		net.wwf();
//		set.cartoons();
//		set.tatasky();
		tv.oldmoviechannel();
		tv.serialchannel();
		System.out.println("mother  enjoy the serials........");
		
		
	}
	
}
class child implements comment{
	setofbox set;
	public child(setofbox set) {
	//	this.net=net;
		this.set=set;
		//this.tv=tv;
	}

	@Override
	public void excequte() {
		System.out.println("child started cartoon.....");
		//net.hollywoodmovie();
		//net.wwf();
		set.cartoons();
		set.tatasky();
		//tv.oldmoviechannel();
		//tv.serialchannel();
		System.out.println("child  enjoy the cartoon........");
		
	}
	
}
class Dummy implements comment{

	@Override
	public void excequte() {
		System.out.println("this is dummy comments....");
		
	}
	
}
class Remote{
	comment[] com=new comment[5];
	public Remote() {
		for(int i=0;i<com.length;i++) {
			com[i]=new Dummy();
		}
	}
	public void setComment(comment com,int slot){
		this.com[slot]=com;
	}
	public void excequtecomment(int slot) {
		com[slot].excequte();
	}
		
	}
	




