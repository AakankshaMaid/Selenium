package Method_With_Return_Type;

public class demo1 {
	
	public String m1()
	
	{
		String name="Akki";
		
		System.out.println(name.charAt(2));
		
		return name;
		
	}
	public static void main(String[] args) {
		demo1 d=new demo1();
		String s2=d.m1();
		
	}

}
