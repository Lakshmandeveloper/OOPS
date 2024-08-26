
public class StaticDemo1 {
	int a=10;
	static int b=20;
	public static void main(String args[]) {
		System.out.println(b);
		System.out.println(StaticDemo1.b);
		StaticDemo1 p=new StaticDemo1();
		System.out.println(p.a);
		System.out.println(p.b);
		
	}

}
