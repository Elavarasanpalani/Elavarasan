package staticdemo;

public class ConstructorNextDemo2 {

	public static void main(String[] args) {
		
		School temp = School.createSchool();
		School.createSchool();
		
	System.out.println("fgdfg");
		
		temp=School.createSchool();
	   System.out.println(temp);
	///	
		temp=School.createSchool();
			System.out.println(temp);
		

	}

}
class School{
	private School() {
		System.out.println("school object created...");
	}
	   	static int count=0;
	   static   School schoolne=new School();
	  public static   School createSchool() {//return new School;//because iam  returing the school
		  if(count<5) {
			  count++;
			  return new School();///returnn the objct for main method
		  }
		  else {
			  return schoolne;
		  }
		
		
		  
	  }
}
