package Method_With_Return_Type;

public class Sample2 {
	public static void main(String[] args)
	{
		String s=m1("akki");
		System.out.println(s);
		
	}
	public static String m1 (String s1)
	{
		s1=s1.toUpperCase();
		return s1;
	}

}
