package keywords;

public class AceessDemo23 {

	public static void main(String[] args) {
	pre1 dd=new pre1();
	dd.met();

	}

}
class pre{
	 private void met() {
		 int i=1/1;
		System.out.println("the value  is privatelay");
	}
}
class pre1 extends pre{
	 public void met() {
		 System.out.println("is over ride");
	 }
	
}
