package excersiese4;

public class OrderPrimeNum {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
		/*	if(i==0||i==1) {
				System.out.println(" prime "+i);
			}*/
			//System.out.println(i);
			if(i%1==0||i%2==0|| i%3==0||i%5==0 ||i%7==0) {
				System.out.println("\n This is not  prime..="+i);
			}
			else if(i%2!=0|| i%3!=0||i%5!=0|| i%7!=0 ) {
				System.out.println("\n this is prime num="+i);
			}
			
		}
	}

}
