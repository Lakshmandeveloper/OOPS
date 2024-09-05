class Person
{
	String name;
	int age;
	void setPersonDetails(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	void getPersonDetails()
	{
	System.out.println("Personal Details: Name="+name+",Age="+age);
	}
}
class Student1 extends Person
{
	String course;
	float avg;
	void setStudentDetails(String course,float avg)
	{
		this.course=course;
		this.avg=avg;
	}
	void getStudentDetails() {
System.out.println("Student Details: Course="+course+",Average="+avg);
	}
}

class Employee extends Person
{
	int empid,salary;
	void setEmployeeDetails(int empid,int salary)
	{
		this.empid=empid;
		this.salary=salary;
	}
	void getEmployeeDetails() {
System.out.println("Employee Details: Empid="+empid+",salary="+salary);
	}
}
public class HierarchicalDemo {

	public static void main(String args[])
	{
		Student1 s=new Student1();
		s.setPersonDetails("Ajay", 35);
		s.setStudentDetails("Java", 75.5f);
		s.getPersonDetails();
		s.getStudentDetails();
		
		Employee e=new Employee();
		e.setPersonDetails("RAju", 40);
		e.setEmployeeDetails(1234, 45678);
		e.getPersonDetails();
		e.getEmployeeDetails();
	}
}






