class A
{
	private  int x;
	A()
	{
		  System.out.println("A class constructor ");
	}
	{
		x=10;
	   System.out.println("A class nonstatic block1 ");
	}
	void show()
	{
		System.out.println("nonstatic method show A ");
	}
	
	{
	   System.out.println("A class nonstatic block2 ");
	}
}
class Test
{
	
	public static void main(String arg[])
	{
	    System.out.println("main method ");
	   A ob=new A();

	}
	
}