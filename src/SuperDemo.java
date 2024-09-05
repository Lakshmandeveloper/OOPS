class M
{
	int x,y;
	void getData()
	{
		System.out.println("Super class x="+x+",y="+y);
	}
}
class N extends M
{
	int x,y;
	void writeData()
	{
		x=10;
		y=20;
		super.x=x;
		super.y=y;
	}
	void readData()
	{
		System.out.println("sub class x="+x+",y="+y);
	}
}
class SuperDemo
{
	public static void main(String args[])
	{
		//sub class object
		N p=new N();
		p.writeData();
		p.getData();
		p.readData();
	}
}

