
public class GlobalVarDemo {
	int x, y;
	void add(int a,int b) {
// copy local variables into instance variables
		x=a;
		y=b;
		System.out.println(x+y);
	}
	void sub() {
		System.out.println(x-y);
		
	}
	public static void main(String args[]) {
		GlobalVarDemo p= new GlobalVarDemo();
		p.add(10,20 );
		p.sub();
	}
}
