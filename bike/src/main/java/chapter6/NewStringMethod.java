package chapter6;

public class NewStringMethod {

	public static void main(String[] args) {
		String 	str=new String("     hello");
		String str2="ela";
		String str5="";
		System.out.println(str.strip());
		System.out.println(str==str2);//because we caompere only objcet not a value
		System.out.println(str.equals(str2));
		
		System.out.println(str2.length()); /// it is calculatie in length
		 System.out.println(str.concat(str2));// concadinate of two String 	
		   System.out.println(str.compareTo(str2));// compare value of two string
		   
		   System.out.println("testing is a part of Softwaretestinghelp: " + str.contains(str2));
		   System.out.printf("%2.3f",100.3848); 
		   
		   
	       
		
		if(str.equals(str2)) {
			System.out.println("it is equal");
		}
		
		String str3="tamil    Tamill                    ";
		System.out.println("the value\n"+str3.charAt(3));
		System.out.println("\n"+str3.toString());
		
		 System.out.println(str2.hashCode());//The hashCode() method returns the hash code of a string.
		 System.out.println(str5.isEmpty());
		
		String str4="java is a papular programming languagre";
				boolean num=str4.contains("fgh");
						System.out.println(num);
						
				
		

	}

}
