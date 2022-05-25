package staticdemo;

public class ClassDemoobj {

	public static void main(String[] args) {
		Demo2 obj3=new Demo2();
		//obj3.Demo3;
		System.out.println(obj3.obj+" "+obj3.obj2);
		System.out.println(obj3.obj2);

	}

}
class Demo1{
	
}
class Demo2{
	Demo3 obj=new Demo3();
  static  Demo1 obj2=new Demo1();
}
class Demo3{
	//string e;
	
}