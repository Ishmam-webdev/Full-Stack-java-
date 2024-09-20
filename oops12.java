import java.util.*;
class Student
{
	private String name;
	private int roll;
	private double mark;

	void det()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	name=sc.nextLine();
	System.out.println("Enter Rollno");
	roll=sc.nextInt();
	System.out.println("Enter Mark");
	mark=sc.nextDouble();

	}

	void pri()
	{
		System.out.println("My Name is "+name);
		System.out.println("My Rollno is "+roll);
		System.out.println("My Mark is "+mark);
	}

}

class Test
{
	public static void main(String agrs[])
	{
		Student obj=new Student();
		obj.det();
		obj.pri();
	}
}