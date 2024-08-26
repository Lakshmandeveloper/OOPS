
public class GlobalVarDemo2 {
	int x, y;
	void add(int x,int y) {
// copy local variables into instance variables
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	void sub() {
		System.out.println(x-y);
		
	}
	public static void main(String args[]) {
		GlobalVarDemo2 p= new GlobalVarDemo2();
		p.add(10,20 );
		p.sub();
	}
}
