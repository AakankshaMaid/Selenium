package Collection_Framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_IC {
	public static void main(String[] args) {
		
		Vector V=new Vector();
		
		V.add("Akki"); //0
		V.add(101);    //1
		V.add('A');    //2
		V.add(20.12f); //3
		V.add(null);   //4
		V.add(null);   //5
		
		System.out.println(V); //find vector class data
		System.out.println(V.size()); //find size
		System.out.println(V.isEmpty()); //false
		System.out.println(V.get(3)); //20.12
		
		V.set(4, "Abhay");  //set method use to update existing value
		System.out.println(V);
		
		V.add(1,20);    //use to add new info
		System.out.println(V);
		
		V.remove(1);  //use to remove info
		System.out.println(V);
		
		System.out.println("----print data using iterator----");
		
		Iterator itr=V.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print data using listIterator----");
		
		ListIterator litr=V.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print data using Enumeration---");
		
		Enumeration enu=V.elements();  //this iterator only use for vector IC
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("---print data using for each loop---");
		
		for(Object s1:V)
		{
			System.out.println(s1);
		}
		
		System.out.println("----print data using for loop---");
		
		for(int i=0;i<=V.size()-1;i++)
		{
			System.out.println(V.get(i));
		}
		
		V.clear();
		System.out.println(V.isEmpty());
		
		
		
	}

}
