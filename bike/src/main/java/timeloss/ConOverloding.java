package timeloss;

public class ConOverloding {

	public static void main(String[] args) {
		Tiger ss=new Tiger(new Tiger());
		//ss.hunting();
		

	}

}
class Tiger{
	Tiger tig;
	public Tiger() {
		System.out.println("Tiger is a wild animal");
	}
	public Tiger(Tiger ela) {
		this.tig=ela;
		System.out.println("the tiger name is elavarasan...");	
	}
	
	public void hunting() {
		System.out.println("it is hunting deer..");
	}
}
