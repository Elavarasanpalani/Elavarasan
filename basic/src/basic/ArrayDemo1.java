package basic;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] []twod={ {10,20,30},
				{38,3,4,34},
				{5656,5656,76767}};
		
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		System.out.println();
		

		for(int i=0;i<twod.length;i++) {
			for(int j=0;j<twod[i].length;j++) {
				System.out.print(twod[i][j]+"\t");
			}
			 System.out.println();
		}
		     
	}
	
	

}


