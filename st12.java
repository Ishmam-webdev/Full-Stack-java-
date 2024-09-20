class A
{
	private  int x;
	static int y;
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
	static
	{
	   System.out.println("A class static block ");
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