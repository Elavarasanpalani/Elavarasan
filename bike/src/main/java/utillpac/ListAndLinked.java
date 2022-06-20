package utillpac;

import java.util.ArrayList;
import java.util.List;

public class ListAndLinked {

	public static void main(String[] args) {
		List<String> js=new ArrayList<>();
		js.add("abb");
		js.add("bbb");
		js.add("ccc");
		js.add("fff");
		System.out.println(js);
		System.out.println();
		System.out.println(js.size());
		
		System.out.println(js.remove(1));//it show remove only
		System.out.println(js);
		
		System.out.println(js.get(0));//it  was get the value of index
		

	}

}
