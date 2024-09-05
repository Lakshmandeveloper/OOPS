class Super
{
	Super(int a,int b)
	{
		System.out.println("Super class constructor,a="+a+",b="+b);
	}
}
class Sub extends Super
{
	Sub(int a,int b)
	{
		super(a,b);
		System.out.println("Sub class default constructor");
	}
	 public static void main(String[] args)
	{
		new Sub(10,20);
	}
}