class Ram
{
	int age;
	String name;
	//constructor
	Ram(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void getPersonDetails()
	{
		System.out.println("Person Object: name="+name+",age="+age);
	}
}

class Sita extends Ram
{
	String course;
	float avg;
	//Constructor
	Sita(int age,String name,String course,float avg)
	{
		super(age,name);
		this.course=course;
		this.avg=avg;
	}
	void getStudentDetails()
	{
		super.getPersonDetails();
		System.out.println("Student: Course="+course+",Average="+avg);
	}
}
class Lakshman
{
	public static void main(String args[])
	{
		Sita s=new Sita(30,"Ajay","Java",75.5f);
		s.getStudentDetails();
	}
}
