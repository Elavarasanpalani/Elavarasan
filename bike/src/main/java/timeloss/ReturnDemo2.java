package timeloss;

public class ReturnDemo2 {
	public static void main(String[] args) {
		  ReturnDemo2 obj = new ReturnDemo2();  
	        int result = obj.CompareNum();  
	        System.out.println("The greater number among x and y is: " + result);  
	}
	 public int CompareNum()   
	    {   
	       int  x = 7;  
	        int y = 8;  
	        System.out.println("x = " + x + "\ny = " + y);  
	        if(5>9) {
	        	//System.out.println("this is return process");
	        	return x;  
	        }
	            
	        else  {
	        	return  y;  
	        	
	        }
	            

}
}
