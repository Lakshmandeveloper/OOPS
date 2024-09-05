class Company
{
	int id;
	String name;
	void setCompanyDetails(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void getCompanyDetails() {
		System.out.println("Company Deatils: Id="+id+", Name="+name);
	}
}
class Employees extends Company
{
	int salary;
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	void getEmployeeDetails()
	{
		super.getCompanyDetails();
		System.out.println("Employee Details: salary="+salary);
	}
}

class Manager extends Employees
{
	int salary;
	void setManagerSalary()
	{
		salary=2*super.salary;
	}
	void getManagerDetails()
	{
		super.getEmployeeDetails();
		System.out.println("Manager Details: Salary="+salary);
	}
}
class InheritanceDemo3
{
	public static void main(String args[])
	{
		Manager m=new Manager();
		m.setCompanyDetails(12345, "Infosys");
		m.setSalary(20000);
		m.setManagerSalary();
		m.getManagerDetails();
	}
}

