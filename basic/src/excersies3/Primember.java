package excersies3;

public class Primember {

	public static void main(String[] args) {
		int i =0; 
	     int num =0; 
	     
		//Empty Stringd
		String primeNumbers = ""; 
		 for ( i = 1; i <= 100; i++) 
		 { 
			 int counter=0; 
		 
		for( num =i; num>=1; num--) 
		 { 
		 if(i%num==0) 
		 { 
		 counter = counter + 1; 
		//System.out.println(counter);
		//counter++;
		 //break;
		 // 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		 } 
		 } 
		 if (counter ==2) 
		 { 
		 //Appended the Prime number to the String
		primeNumbers = primeNumbers + i + " "; 
			// System.out.println(counter);
		 } 
		 } 
		 System.out.println("Prime numbers from 1 to 100 are :"); 
		 System.out.println(primeNumbers); 
	}

}
