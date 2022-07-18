package revvision;



public class Savaimaiyam1 {
	public static void main(String[] args) {
		Savai sa=new Savai();
		sa.excequtecomment(1);
		
	}

}
class Savai{
	comment[] com=new comment[5];
	public Savai() {
		for(int o=0;o<com.length;o++){
			//int o = 0;
			com[o]=new Dummycommend();
		}
		
	}
	public void setcomment(comment com,int slot) {
	this.com[slot]=com;
		
	}
	public void excequtecomment(int slot) {
		com[slot].excequte();		
		
	}
	
	
}

interface comment{
	public void excequte();
	
}

class Dummycommend implements comment{

	@Override
	public void excequte() {
		System.out.println("dummey comment  is excequte.....");
		
	}
	
}