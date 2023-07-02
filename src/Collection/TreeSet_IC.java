package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_IC {
//this IC use to print asending order data and not accept duplicate data
	//also this class accept only same type info data 
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(101);
		t.add(105);
		t.add(104);
		t.add(103);
		t.add(102);
		t.add(101);
		t.add(107);
		t.add(106);
		
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		
		t.remove(104);
		System.out.println(t);
		
		System.out.println(t.first()); //use for print 1st data
		System.out.println(t.last()); //use to print last data
		
		t.pollFirst(); //use to remove first data
		System.out.println(t);
		
		t.pollLast();  //use to remove last data 
		System.out.println(t);
		
		System.out.println("---print data using iterator---");
		
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("---print data using for each loop---");
		
		for(Object o: t)
		{
			System.out.println(o);
		}
	}
}
