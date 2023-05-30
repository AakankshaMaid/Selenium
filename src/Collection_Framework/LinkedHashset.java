package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add("kriti");
		lhs.add(null);
		lhs.add('A');
		lhs.add('A');
		lhs.add(44.45f);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		lhs.remove(44.45f);
		System.out.println(lhs);
		
		System.out.println("---print data using iterator---");
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print data using for each loop---");
		
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
	} 
	

}
