package revvision;

public class Builder2 {
	public static void main(String[] args) {
		computer2 coms=new computer2.ComBulder("3gb", "2gb").setisgrap(true).serisblue(true).build();
		System.out.println(coms);
	}

}
class computer2{
	private String HDD;
	private String RAM;
	
	private boolean  isgrapical;
	private boolean isblutooth;
	
	public String getHDD() {
		return HDD;
		
	}
	public String RAM() {
		return RAM;
	}
	
	private computer2(ComBulder   com) {
	this.HDD=com.HDD;
	this.RAM=com.RAM;
	this.isblutooth=com.isblutooth;
	this.isgrapical=com.isgrapical;
	
		
	}
	
	
	
	
public static class ComBulder{
	private String HDD;
	private String RAM;
	
	private boolean isgrapical;
	private boolean isblutooth;
	
	public ComBulder(String hdd,String ram) {
	this.HDD=hdd;
	this.RAM=ram;
	}
	
	public ComBulder setisgrap(boolean isgrapical) {
		this.isgrapical=isgrapical;
		return this;
		
		
	}
	public ComBulder serisblue(boolean isblutooth) {
		this.isblutooth=isblutooth;
		return this;
	}
	
	public  computer2 build() {
		return new computer2(this);
	}
	
	
}
	
}

