package Collection_Framework;

import java.util.HashSet;

public class demo4 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add('a');
		hs.add(100);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}

}
