package staticdemo;

public class SingletonDemo {

	public static void main(String[] args) {
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		DpConnection.getDbcon();
		
		
		
	}

}
class DpConnection{
   private DpConnection(){
	   System.out.println("DB object create...");
   
   }
   private static DpConnection dpcon;///complax type 
   public static  DpConnection getDbcon() {
	   if (dpcon== null) {
		   dpcon=new DpConnection();
		   return dpcon;	
	   }else {
		   return dpcon;
	   }
	
	   
   }
	

		
	
}