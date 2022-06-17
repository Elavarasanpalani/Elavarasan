package staticdemoDemo1;

import staticdemo.Sameclass;

public class diffrentpackage {
	public void met() {
		Sameclass dd=new  Sameclass();
<<<<<<< HEAD
	//	System.out.println(dd.pri);//ptivet not accept for the nosub class
		//System.out.println(dd.nomod);
		//System.out.println(dd.pro);
		System.out.println(dd.pub);
	}

}
class diffsubclass extends Sameclass{
	public void met() {
		//System.out.println(pri);
	//	System.out.println(nomod);
=======
		System.out.println(dd.pri);//ptivet not accept for the nosub class
		System.out.println(dd.nomod);
		System.out.println(dd.pro);
		System.out.println(dd.pub);
	}

}
class diffsubclass extends Sameclass{
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
>>>>>>> branch 'master' of https://github.com/Elavarasanpalani/Elavarasan.git
		System.out.println(pro);
		System.out.println(pub);
	}
}