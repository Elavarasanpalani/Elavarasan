package keywords;

public class Transaction implements Cloneable{
		private static Transaction transObj;
		int amt;
		private Transaction() {
			System.out.println(" transaction object..");
		}
		public static Transaction createTransactionobj() {
			if(transObj==null) {
				transObj =new Transaction();
				return transObj;
			}
			else {
				return transObj.createClone();//new Transaction();//transObj;//.createClone();
				
			}		
		}
		private Transaction createClone() {
			try {
				return (Transaction)super.clone();
			}catch(Exception e) {
				System.out.println(e);
				return null;
			}
			
		}

}
