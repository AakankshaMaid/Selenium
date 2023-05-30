package Method_With_Return_Type;

public class Sample1 {
	//return type=void,int,String
	
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		int num1=s1.add(10,20);
		System.out.println(num1);
		//OR
		System.out.println(s1.add(10,20));
		System.out.println("--------------");
	int num2=multi(15,30);
	System.out.println(num2);
			
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int multi(int a,int b)
	{
		int c=a*b;
		return c;
	}

}
