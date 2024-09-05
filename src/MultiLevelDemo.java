class Students
{
	void fee() {
		System.out.println("students course fee $:"+3000);
	}
}
class StudentName extends Students
{
	void name() {
		System.out.println("student name is raju");
	}
}
class StudentSubject extends StudentName{
	void subject() {
		System.out.println("course taken : Advanced Java");
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		StudentSubject obj=new StudentSubject();
		obj.subject();
		obj.name();
		obj.fee();
		

	}

}
