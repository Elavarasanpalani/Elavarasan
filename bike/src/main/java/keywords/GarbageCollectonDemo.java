package keywords;



public class GarbageCollectonDemo {

	public static void main(String[] args) {
	 Runtime r= Runtime.getRuntime();
	 System.out.println("Availabe Memaory...."+r.maxMemory());
	 System.out.println("Avalilabel processor...."+r.availableProcessors());
	 System.out.println("Available freeMemory......"+r.freeMemory());//glasterfreememory
	 r.gc();
	 System.out.println("After avalible free memory..."+r.freeMemory());
	 Grandfather1 grand =new Grandfather1();
	 grand=null;
	// System.out.println(grand.getgold());
	 System.out.println("after the death.."+r.freeMemory());//but memory space only delacet but its recoverable
	 System.out.println("grand kariamm.....");
	  r.gc();
	 System.out.println("after the death rcover the memory of grand..."+r.freeMemory());
	 
		
		
	}

}
class Grandfather1{
	String age;
	private  String goald="gold is under the tree...";
	public Grandfather1() {
		for (int i=0;i<10000;i++) {
			age=new String("my name is billa.."+i);
		}
	}
	protected String getgold() {
		return "hte gold is under the tree"+goald;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getgold());
	}
	
	
}
