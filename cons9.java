import java.util.*;
class Student
{
	private String name;
	private int roll;
	private double mark;
	Student( String name, int roll, double mark)
	{
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of student is");
		name=sc.nextLine();
		roll=sc.nextInt();
		mark=sc.nextDouble();
	}

	void show()
	{
		System.out.println("Name of student is "+name);
		System.out.println("Roll No of student is "+roll);
		System.out.println("Mark of student is "+mark);
	}

	public static void main(String args[])
	{
		Student ob=new Student();
		ob.show();
		Student obj1=new Student();
	}
}