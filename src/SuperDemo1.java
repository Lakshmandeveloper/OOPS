class O
{
	int x=100;
}
class Q extends O
{
	int x=200;
	void disp(int x)
	{
		System.out.println(x);
		System.out.println(this.x); //will access instance members
		System.out.println(super.x); // access the immediate super class members
		
	}
}
class SuperDemo1 {

	public static void main(String[] args) {
		Q  p=new Q();
		p.disp(300);
		
	}

}
