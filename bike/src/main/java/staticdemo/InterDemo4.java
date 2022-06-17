package staticdemo;

public class InterDemo4 {
	//Markinterface

	public static void main(String[] args) {
		CorporationIDCard ela=new CorporationStudent();
		ConvertIDCard kamal=new ConverStudent();
		//System.out.println(ela);
		//System.out.println(kamal);
		
		InterDemo4 cmap=new InterDemo4();
		cmap.luxurayRomm(kamal);
		
		
		
		
		
		
	}
	public void luxurayRomm(ConvertIDCard kamal) {
		System.out.println("the strundet");
	}
	public void ordnariroom(CorporationIDCard ela) {
		
	}

}
interface   CorporationIDCard{
	
}
interface  ConvertIDCard{
	
}
class CorporationStudent implements CorporationIDCard,ConvertIDCard{
	
}
class ConverStudent implements ConvertIDCard{
	
}
