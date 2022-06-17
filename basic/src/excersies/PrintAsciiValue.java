package excersies;

public class PrintAsciiValue {

	public static void main(String[] args) {
		char ch='A';
		
		int ascii=ch;
		// You can also cast char to int
		
		int castascii =(int) ch;  //Java converts the character value to an ASCII value.
    //cast-casting is converting variable from one type to another
		System.out.println("The ASCII value of  is: " + ascii); 
		 System.out.println("The ASCII value of " + ch + " is: " + castascii);
	}

}
