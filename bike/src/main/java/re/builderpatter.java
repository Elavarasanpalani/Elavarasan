package re;

public class builderpatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Computer{
	private String Hdd;
	private String RAM;
	private boolean isblue;
	private boolean isgrrag;
	
	
	
	
	public Computer(ComputerBuilder builder) {
		this.Hdd=builder.Hdd;
		
		
		
	}
	
	
	public static class ComputerBuilder{
		private String Hdd;
		private String RAM;
		private boolean isblue;
		private boolean isgrrag;
		
		
		public ComputerBuilder( String hdd,String Ram) {
			this.Hdd=hdd;
			this.RAM=Ram;
			
		}
		
		public ComputerBuilder  setisblue(boolean  isblue) {
			this.isblue=isblue;
			
			return this;
			
		}
		public ComputerBuilder serisgraf(boolean   isgrrag) {
			this.isgrrag=isgrrag;
			return this;
			
		}
		
		
		
		public Computer build() {
			return new Computer(this);
					
					
			
		}
	}
	
	
	
}