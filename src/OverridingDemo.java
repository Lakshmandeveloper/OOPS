class K
{
	int a,b;
	void setData() {
		a=100;b=200;
		}
	void getData() {
		System.out.println("Super class, a="+a+",b="+b );
	}
}
class B extends  K
{
	int x,y;
	void setData() {
		super.setData();
		x=10;y=20;
		
	}
	void getData() {
		super.getData();
		System.out.println("sub class x="+x+",y="+y);
	}
}
class OverridingDemo {

	public static void main(String[] args) {
		B p=new B();
		p.setData();
		p.getData();
		

	}

}
