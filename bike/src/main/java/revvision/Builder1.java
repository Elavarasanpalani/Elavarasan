package revvision;
import javax.management.loading.PrivateClassLoader;

public class Builder1 {
	public static void main(String[] args) {
		
		Computer1 com=new Computer1.ComputerBuilder("2gp","120gp").built();
		System.out.println(com);
	}

}
class Computer1{
	
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluootoothEnable;
	
	
	public String getHDD() {
		System.out.println("hdd");
		return  HDD;
			
	}
	public String getRam() {
		System.out.println("gekgfkgk");
		return RAM;
	}
		
		
	public boolean isGraphicsCardEnabled() {  
		
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluootoothEnable() {
		
		return isBluootoothEnable;
	}
	private Computer1(ComputerBuilder computerbuilder) {
		this.HDD=computerbuilder.HDD;
		this.RAM=computerbuilder.RAM;
		this.isBluootoothEnable=computerbuilder.isBluootoothEnable;
		this.isGraphicsCardEnabled=computerbuilder.isGraphicsCardEnabled;
	}

public static class ComputerBuilder{
	
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluootoothEnable;
	
	public ComputerBuilder(String hdd, String ram){
		this.HDD=hdd;
		this.RAM=ram;
	
	}
	public ComputerBuilder setisGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled=isGraphicsCardEnabled;
		return this;
	}
	public ComputerBuilder setisBluootoothEnable(boolean isBluootoothEnable) {
		this.isBluootoothEnable=isBluootoothEnable;
	return this;
	}
	public Computer1 built() {
		return new Computer1(this);
	}
	
	
}
}

