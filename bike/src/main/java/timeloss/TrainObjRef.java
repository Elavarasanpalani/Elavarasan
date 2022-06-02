package timeloss;

public class TrainObjRef {

	public static void main(String[] args) {
		Box ab=new Box("ekavarasan");
		Box b2=ab;
		System.out.println(ab);
		System.out.println(b2);
	}

}
class Box{
	public Box(String u) {
		System.out.println();
	}
	
}
