package excersiese4;

public class Order {

	public static void main(String[] args) {
		for(int i=1;i<50;i++) {
			//System.out.println(i);
		
		//int i=0;
			if(i==2 || i==3 || i==5 || i==7) {
				System.out.println("\n prime...="+i);
			}
			else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
			System.out.println("\n prime...="+i);
		}
			else {
				System.out.println("\n not prime...="+i);
			}
		
		
		}
	}

}
