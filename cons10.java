import java.util.*;
class Employee
{
	private String name;
	private String dept;
	private int id;
	private int salary;
	private String workp;
	 
	Employee(String name, String dept, int id, int salary, String workp)
	{
		this.name=name;
		this.dept=dept;
		this.id=id;
		this.salary=salary;
		this.workp=workp;
	}
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Emp");
		name=sc.nextLine();
		System.out.println("Enter the DEPT of Emp");
		dept=sc.nextLine();
		System.out.println("Enter the ID of Emp");
		id=sc.nextInt();
		System.out.println("Enter the Salary of Emp");
		salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Work Place of Emp");
		workp=sc.nextLine();
	}
	void show()
	{
		System.out.println("The Name of Emp is= "+name);
		System.out.println("The Dept of Emp is= "+dept);
		System.out.println("The Id of Emp is= "+id);
		System.out.println("The Salary of Emp is= "+salary);
		System.out.println("Emp work in= "+workp);
	}
	public static void main(String args[])
	{
		Employee ob=new Employee();
		ob.show();
	}
}