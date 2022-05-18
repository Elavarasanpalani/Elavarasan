package basic;

public class ProgrammingFor4 {

	public static void main(String[] args) {
	//	for(;;) {
	//		System.out.println("ela");
	//	}
		
		for(int i=0;i<10;i++) {
			System.out.println("this is value =...."+i);
		}
		
		for(int i=10;i>0;i--) {
			System.out.println("value=..."+i);
		}
		for(int i=10,j=0;i>0&&j<10;i--,j++) {
			System.out.println(i+"..."+j);
		}
		for(int i=0,j=20;i<10 &&j>0;i++,j--) {
			System.out.println(i+"......."+j);
		}
	}

}
