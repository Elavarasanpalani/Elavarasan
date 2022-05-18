package excersies2;

public class PyramidExamples {

	public static void main(String[] args) {
		/*	for(int i=1;i<=5;i++){ 
			for(int j=1;j<=i;j++){ 
			 System.out.print("* "); 			 } 
			 System.out.println();//new line */
		
		
	/*	for(int i=1; i<=6; i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("* ");
			}
			    System.out.println();
		}*/
       /* for(int i=1;i<=6;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }*/
        for(int i=1;i<=6;i++) {
        	for(int j=6;j>1;j--) {
        		System.out.print(" ");
        	}
        	{
        		for(int k=1;k<=i;k++) {
        			System.out.print(" *");
        		}
        	}
        	System.out.println();
        }
		
		}	
	
	}


