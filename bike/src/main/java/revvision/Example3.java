package revvision;

public class Example3 {

	public static void main(String[] args) {
    Demo de=new Demo();
    de.met1(10, "elavarasan", 20);
    
    int a[] =new int[] {10,20,30,405,60};
    de.met2(a);
    
    de.met2(new int[] {10,30,40,50});//direct
    
    
    de.met3(10,30,503,372,02);
   int abc[]= de.met3(329,59,78,38);
   
   
   de.met4("aaa",1929,"dfas",new Demo()); 
    
    
 
	}
	
}
class Demo{
	
	
	void met1(int i, String s,int j) {
		System.out.println(i+":"+s+":"+j);
		
		
	}
	void met2(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			
		}
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	int [] met3(int...abc) {
		for(int i:abc) {
			System.out.println(i);
		}
		return 	abc;
	}
	
	void met4(Object...o) {
		
	}
}
