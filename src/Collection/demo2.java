package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class demo2 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(null);
		l.add(null);
		l.add('A');
		l.add("Akki");
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		l.add(1,"akki");
		System.out.println(l);
		l.set(0, 500);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator litr=l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		for(Object o:l)
		{
			System.out.println(o);
		}
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
	}

}
