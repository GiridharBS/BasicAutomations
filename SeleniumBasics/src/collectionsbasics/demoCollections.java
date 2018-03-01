package collectionsbasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class demoCollections {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("QSP");
		a.add("JSP");
		a.add("QSP");
		
		for (String b:a)
		{
			System.out.println(b);
		}
		
		HashSet<String> h = new HashSet<String>(a);
		System.out.println(a.size());
		System.out.println(h.size());
		
		for (String c:h)
		{
			System.out.println(c);
		}
		
		TreeSet<String> t = new TreeSet<String>();
		t.add("QSP");
		t.add("JSP");
		t.add("QSP");
		
		for (String e:t)
		{
			System.out.println(e);
		}
		

	}

}
