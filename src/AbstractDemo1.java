abstract class AreaDemo{
	abstract void area();
}
class Square extends AreaDemo{
	@Override
	void area() {
		double r=3.455;
		double a=3.14*r*r;
		System.out.println(a);
	}
}
class Circle extends AreaDemo
{
	@Override
	void area()
	{
		double r=3.455;
		double a=3.14*r*r;
		System.out.println(a);
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.area();
		Square s=new Square();
		s.area();
		
		

	}

}
