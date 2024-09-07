class Superb
{
	Superb(int a,int b)
	{
		System.out.println("Super class constructor,a="+a+",b="+b);
	}
}
class Subsidy extends Superb
{
	Subsidy(int a,int b)
	{
		super(a,b);
		System.out.println("Sub class default constructor");
	}
	 public static void main(String[] args)
	{
		new Subsidy(10,20);
	}
}