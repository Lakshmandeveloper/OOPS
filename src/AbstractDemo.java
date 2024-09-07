abstract class A1{
	int a,b;
	abstract void setData();
	void getData()
	{
		System.out.println("super class a="+a+",b="+b);
	}
}
class B1 extends A1{
	int x,y;
	@Override
	void setData() {
		x=100;y=200;
		a=x;b=y;
	}
	void display() {
		System.out.println("sub class x="+x+",y="+y);
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		B1 p=new B1();
		p.setData();
		p.getData();
		p.display();
		

	}

}
