interface M1
{
	public abstract void setData();
	public abstract void getData();
}
class N1 implements M1
{
	int x,y;

	@Override
	public void setData() {
		x=100;y=20;		
	}

	@Override
	public void getData() {
		System.out.println("Sub class x="+x+",y="+y);		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		N1 p=new N1();
		p.setData();
		p.getData();

	}

}
