package test;

public class BuilderPattern {
	public static void main(String[] args) {
		Computer com=new Computer.ComputerBuilder("5gd", "4gb").blutooths(true).isgraficcards(false).build();
		System.out.println(com);
	System.out.println(	com.blutooth());
		System.out.println(com.getHDD());
		System.out.println(com.isgraficcare());
		System.out.println(com.getRAM());
	}
	
	

}
class Computer{
  private String HDD;
  private String RAM;
  private boolean isgraficcard;
	private boolean blutooth;
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isgraficcare(){	
		return isgraficcard;
		
	}
	public boolean blutooth() {
		return blutooth;
	}
	
	public Computer(ComputerBuilder builder) {
		this.HDD =builder.HDD;
		this.RAM=builder.RAM; 
		this.blutooth=builder.blutooth;
		this.isgraficcard=builder.isgraficcard;	
		
	}
	public  static class ComputerBuilder{
		  private String HDD;
		  private String RAM;
		  private boolean isgraficcard;
			private boolean blutooth;
		
		
		public ComputerBuilder(String HDD,String RAM) {
			this.HDD=HDD;
			this.RAM=RAM;
			
		}
		public ComputerBuilder isgraficcards(boolean isgraficcard) {
		this.isgraficcard=isgraficcard;
		return this;	
		}
		public ComputerBuilder blutooths(boolean blutooth) {
			this.blutooth=blutooth;
			return this;
		}
		
		public Computer build() {
			return  new Computer(this);
		}
		
		
		
		
	}
}

