package staticdemoDemo1;

import staticdemo.Sameclass;

public class diffrentpackage {
	public void met() {
		Sameclass dd=new  Sameclass();
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
//		System.out.println(dd.pri);//ptivet not accept for the nosub class
//		System.out.println(dd.nomod);
//		System.out.println(dd.pro);
//		System.out.println(dd.pub);
	}

}
