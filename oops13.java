import java.util.*;
class Employe
{
	private String name;
	private int id;
	private String location;
	private String dept;
	private int salary ;

	void detail()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Employee Name ");
	name=sc.next();
	System.out.println("Employee Id ");
	id=sc.nextInt();
	System.out.println("Employee Location");
	location=sc.next();
	System.out.println("Employee Deptment ");
	dept=sc.next();
	System.out.println("Employee Salary ");
	salary=sc.nextInt();

	}

	void pri()
	{
		System.out.println("Employee Name is "+name);
		System.out.println("Employee ID is  "+id);
		System.out.println("Employee Location is "+location);
		System.out.println("Employee Deptment is "+dept);
		System.out.println("Employee Salary is "+salary);
	}

}

class Test
{
	public static void main(String agrs[])
	{
		Employe obj=new Employe();
		obj.detail();
		obj.pri();
	}
}