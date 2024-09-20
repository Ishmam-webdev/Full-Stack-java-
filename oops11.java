class Student
{
	private String name;
	private int roll;
	private double mark;

	void dit()
	{
		name="Ishmam";
		roll=1;
		mark=90.20;
	}

	void pri()
	{
		System.out.println("My name is "+name);
		System.out.println("My Roll is "+roll);
		System.out.println("My Mark is "+mark);
	}
}

class Test
{
	public static void main(String args[])
	{
		Student t=new Student();
		t.dit();
		t.pri();

		Student t1=new Student();
		t1.dit();
		t1.pri();
	}
}






