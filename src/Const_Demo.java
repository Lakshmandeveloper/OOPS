
public class Const_Demo {
	Const_Demo(){
		System.out.println("Default constructor");
	}
	Const_Demo(int a, int b)
	{
		System.out.println("parameterized constructor");
	}
	void disp() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Const_Demo p=new Const_Demo();
		p.disp();
		Const_Demo q=new Const_Demo(10,20);
		q.disp();
		
		//nameless objects or anonymous objects 
		new Const_Demo().disp();
		new Const_Demo(100,200).disp();
		

	}

}
