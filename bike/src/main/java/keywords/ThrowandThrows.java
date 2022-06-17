package keywords;

public class ThrowandThrows {

	//public static void main(String[] args) {
		public static void main(String[] args) throws Exception{
			YesBank yb=new YesBank();
			//try {
				//yb.withDraw(1000000);
			//}catch(Exception e) {
			//	System.out.println(e);
			//}
			System.out.println("business continues...");
		}
	}
	class YesBank{
		public void withDraw(int amt)throws MaxLimitException {
			if(amt>100000) {
				throw new MaxLimitException();
			}
		}
	}
	//class MaxLimitException extends Exception{// coustumes exeception 
	class MaxLimitException extends  Throwable{
	@Override
	public String toString() {
		
		return "expaligfgfn the value";
	}
	}
		
		
		
	


	


