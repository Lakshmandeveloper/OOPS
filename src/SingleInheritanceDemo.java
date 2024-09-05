class Student
{
	void fee() {
		System.out.println("students fee :"+3000);
	}
}
class Student_name extends Student
{
	void name() {
		System.out.println("student name is raju");
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Student_name obj=new Student_name ();
		obj.name();
		obj.fee();
		
		
		

	}

}
