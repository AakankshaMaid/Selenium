package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("Akki");  //order not maintain
		hs.add(null);  //duplicate value is not showing in op
		hs.add(null); //only one null value accepted
		hs.add(101);
		hs.add(66.5f);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		hs.remove(66.5f);
		System.out.println(hs);
		
		System.out.println("---print data using iterator cursor----");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print data using for each loop---");
		
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
	hs.clear();
	System.out.println(hs);
	}

}
