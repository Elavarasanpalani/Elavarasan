package keywords;

public class GarbageCollectonDemo {

	public static void main(String[] args) {
	 Runtime r= Runtime.getRuntime();
	 System.out.println("Availabe Memaory...."+r.maxMemory());
	 System.out.println("Avalilabel processor...."+r.availableProcessors());
	 System.out.println("Available freeMemory"+r.freeMemory());
		
		
	}

}
class Grandfather{
	String age;
	private  String goald="gold is under the tree...";
	public Grandfather() {
		for (int i=0;i<10000;i++) {
			age=new String("my name is billa.."+i);
		}
	}
	
}
