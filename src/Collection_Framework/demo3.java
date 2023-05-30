package Collection_Framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class demo3 {
	public static void main(String[] args) {
	 Vector v=new Vector();
	 v.add('a');
	 v.add("akanksha");
	 v.add(100);
	 v.add(null);
	 v.add(null);
	 
	 System.out.println(v);
	 System.out.println(v.size());
	 System.out.println(v.isEmpty());
	 System.out.println(v.get(0));
	 v.add(0,9);
	 System.out.println(v);
	 v.set(4, 30);
	 System.out.println(v);
	 v.remove(1);
	 System.out.println(v);
	 
	 Iterator itr=v.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
//	 ListIterator litr=v.listIterator();
//	 while(litr.hasNext()) {
//		 System.out.println(litr.next());
//	 }
//	 Enumeration enu=v.elements();
//	 while(enu.hasMoreElements())
//	 {
//		 System.out.println(enu.nextElement());
//	 }
//	 for(Object o:v)
//	 {
//		 System.out.println(o);
//	 }
//	 for (int i=0;i<=v.size()-1;i++)
//	 {
//		 System.out.println(v.get(i));
//	 }
		}

}
