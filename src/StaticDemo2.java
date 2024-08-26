public class StaticDemo2
{
	static int a=10,b=20;
	static void add() 
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	
	public static void main(String args[])
	{
		//direct name
		add();
		sub();
		//class name
		StaticDemo2.add();
		StaticDemo2.sub();
		//object name
		StaticDemo2 sd=new StaticDemo2();
		sd.add();
		sd.sub();	
	}
}