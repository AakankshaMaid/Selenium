package Collection_Framework;

import java.util.TreeSet;

public class TreeSet_IC_3 {
	public static void main(String[] args) {
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(506);
		t.add(502);
		t.add(501);
		t.add(503);
		t.add(505);
		t.add(504);
		
		for(Integer i:t)
		{
			System.out.println(i);
		}
		
	}

}
