package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_IC {
	public static void main(String [] args)
	{
		LinkedList Ll=new LinkedList();
		
		Ll.add(null);
		Ll.add(500);
		Ll.add('A');
		Ll.add("Akki");
		Ll.add(null);
		
		System.out.println(Ll);
		System.out.println(Ll.size());
		System.out.println(Ll.get(1));
		System.out.println(Ll.get(3));
		System.out.println(Ll.contains(null));
		
		Ll.set(0, "Prem");  //update
		System.out.println(Ll);
		
		Ll.add(4,867);   //add
		System.out.println(Ll);
		
		Ll.remove(2);   //remove
		System.out.println(Ll);
		
		System.out.println("--print data using iterator---");
		
		Iterator itr=Ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---print data using listIterator---");
		
		ListIterator litr=Ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print data using for each loop---");
		
		for(Object s1:Ll)
		{
			System.out.println(s1);
		}
		
		System.out.println("---print data using for loop---");
		
		for(int i=0;i<=Ll.size()-1;i++)
		{
			System.out.println(Ll.get(i));
		}
		
		
		
	}

}
