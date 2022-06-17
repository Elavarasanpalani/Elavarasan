package staticdemo;
<<<<<<< HEAD



public class Sameclass {
	
	private int pri;
	int nomod;
	protected int pro;
	public int pub;{
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}	
class Samepacknosub{
	public void met() {
	Sameclass dd=new  Sameclass();
	//	System.out.println(dd.pri);//ptivet not accept for the nosub class
		System.out.println(dd.nomod);
		System.out.println(dd.pro);
		System.out.println(dd.pub);
	}
	}
class samepacksubclass extends Sameclass{
	public void met() {
	//	System.out.println(pri);
=======
public class tamil{
	
}

public class Sameclass {
	
	private int pri;
	int nomod;
	protected int pro;
	public int pub;{
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}	
class Samepacknosub{
	public void met() {
		Sameclass dd=new  Sameclass();
		System.out.println(dd.pri);//ptivet not accept for the nosub class
		System.out.println(dd.nomod);
		System.out.println(dd.pro);
		System.out.println(dd.pub);
	}
	}
class samepacksubclass extends Sameclass{
	public void met() {
		System.out.println(pri);
>>>>>>> branch 'master' of https://github.com/Elavarasanpalani/Elavarasan.git
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
	
	
	

	
	
	

