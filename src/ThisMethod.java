public class ThisMethod 
{
	ThisMethod()
	{
		System.out.println("zero args constructor");
	}
	
	ThisMethod(int a)
	{
		this();
		System.out.println("one args constuctor");
	}
	
	ThisMethod(int a,int b)
	{
		this(a);
		System.out.println("Two args constructor");
	}
	
	public static void main(String args[])
	{
		ThisMethod p=new ThisMethod(10,20);
	}
}