package revvision;

public class Commentpatten1 {

	public static void main(String[] args) {
		univercelremot.remo();
	
	}

}
class univercelremot{
	public static void remo() {
		netflix net=new netflix();
		setofbox set=new setofbox();
		Tv tv=new Tv();
		
		father fa=new father(net, set, tv);
		mother mo=new mother(net, set, tv);
		child ch=new child(net, set, tv);
		
	
		 Remote ree=new Remote();
		 ree.excequtecomment(0);
		 ree.setCommand(fa, 2);
		 ree.excequtecomment(2);
		
		
		
		
	}
}
class netflix{
	public void hollywoodmovies() {
		System.out.println("hollywood movies is started....");
	}
}
class setofbox{
	public void newschannel() {
		System.out.println("news chanel is started.....");
	}
	public void movieschannel() {
		System.out.println("movies vhenal is started.....");
	}
}
class Tv{
	public void cartoon() {
		System.out.println("cartooon movies is started.....");
	}
	
	public void music() {
		System.out.println("music chennal is stared......");
	}
}


 interface Comments{
	 public void excequte();
	 
 }
 class father implements Comments{
	 netflix net;setofbox set; Tv tv;
	 
	 public father( netflix net,setofbox set, Tv tv) {
		 this.net=net;
		 this.set=set;
		 this.tv=tv;
		
	}

	@Override
	public void excequte() {
		System.out.println("father started moviesss......");
		tv.cartoon();
		tv.music();
		set.movieschannel();
		set.newschannel();
		net.hollywoodmovies();
		
		System.out.println("father enjoy the movies....");
		
	}
	 
 }
 class mother implements Comments{
	 netflix net;setofbox set; Tv tv;
	 public mother(netflix net,setofbox set, Tv tv) {
		 this.net=net;
		 this.set=set;
		 this.tv=tv;
		
	}

	@Override
	public void excequte() {
		System.out.println("mother start serial channel....");
		tv.cartoon();
		tv.music();
		set.movieschannel();
		set.newschannel();
		net.hollywoodmovies();
		System.out.println("mother enjoy the serial chennal.....");
	}
	 
 }
 class child implements Comments{
	 netflix net;setofbox set; Tv tv;
	 public child(netflix net,setofbox set, Tv tv) {
		 this.net=net;
		 this.set=set;
		 this.tv=tv;
		
	}

	@Override
	public void excequte() {
		System.out.println("the child em=njoy with cartoon.....");
		tv.cartoon();
		tv.music();
		set.movieschannel();
		set.newschannel();
		net.hollywoodmovies();
		System.out.println("the child enhoy the tv...");
	}
	 
 }
 class Dummy implements Comments{

	@Override
	public void excequte() {
		System.out.println("dummy comments is excequte......");
		
	}
	 
 }
 class Remote{
	 Comments[]  comment=new Comments[5];
	 
	 public Remote() {
		 for(int i=0;i<comment.length;i++) {
			 comment[i]=new Dummy();
			 
		 }
	 }
		 public void  setCommand(Comments comment,int slot) {
			 this.comment[slot]=comment;
		 }
		 public void excequtecomment(int slot) {
			comment[slot].excequte();

		
	}
	 
 }