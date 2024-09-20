class A
{
	private A()
	{
		System.out.println("A private constructor ");
	}
	static void create()
	{
		A ob=new A();
	}
}
class Test
{
	
	public static void main(String arg[])
	{
	  // A ob=new A(); error
		A.create();
	 
	}
	
}