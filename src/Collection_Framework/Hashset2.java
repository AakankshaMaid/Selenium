package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset2 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(100);
		al.add(100);
		al.add("rushi");
		al.add('A');
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		//using hashset class we can remove all duplicate data in arraylist class
		//but order is not maintain 
		
		HashSet hs=new HashSet(al); 	
		System.out.println(hs);
		
		
	}

}
