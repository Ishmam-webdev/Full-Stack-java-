class Student
{
		private String name;  //instance variable   non static datamemeber
	 private  int rollno;
	  private  double mark;
	  void init()  //init we can write any name   
	  {
	  	  name="muna";
	      rollno=1;
	     mark=90.50;

	  }
	  void show()   //display 
	  {

	  	 	System.out.println("my name="+name);
	   		System.out.println("my rollno="+rollno);
	   		System.out.println("my mark="+mark);
	  }
}
class Test
{
 
	public static void main(String arg[])
	{
	   Student t=new Student();
	     t.init();
	     t.show();
	  
	}
}