package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_IC {
	public static void main(String[] args) {
		//List (interface)---->implementation class is ArrayList(IC) present in java.util pakage
		ArrayList al=new ArrayList(); //IC class of List interface
		al.add("Akki"); //0
		al.add(101);   //1
		al.add('A');   //2
		al.add(65.5f); //3
		al.add(null);  //4
		al.add(101);   //5
		
		
		System.out.println(al); //use for checking all info present in array
		System.out.println(al.size());  //use for checking size of data
		System.out.println(al.isEmpty()); //false
		System.out.println(al.get(0)); //get method use to print single data
		
		//add info in between arraylist --->right shift
		al.add(2,201);
		System.out.println(al);
		
		System.out.println(al.contains("Akki"));  //use for checking element present or not
		
		//remove info in between arraylist--->left shift
		al.remove(1);
		System.out.println(al);
		
		al.set(5, 10000); //this method is use to update existing value
		System.out.println(al);
	
		System.out.println("------print data using itrator cursor-----");
		
		Iterator itr=al.iterator();  
		while(itr.hasNext()) //TRUE //hasNext() method use to check data present in it and give boolean o/p
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print data using ListItrator-----");
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----print data using for loop----");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---print data using for Each loop---");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		System.out.println(al.size());
		
		al.clear();  //this method is use to clear all data of ArrayList(IC)
		System.out.println(al.size());
		
		
		
			}

}
