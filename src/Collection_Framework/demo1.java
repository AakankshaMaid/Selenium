package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("akki");
		al.add(200);
		al.add('A');
		al.add(55.2f);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(200));
		System.out.println(al.get(2));
		al.add(1,"sonu");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.set(1, 501);
		System.out.println(al);
		
		Iterator itr=al.iterator();
		 while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		 for(Object o:al)
		 {
			 System.out.println(o);
		 }
		 for(int i=0;i<=al.size()-1;i++)
		 {
			 System.out.println(al.get(i));
		 }
		 al.clear();
		 System.out.println(al.isEmpty());
	}

}
