class A
{
	static 
	{
	   System.out.println("A class static block ");
	}
}
class Test
{
	static
	{
	   System.out.println("static block1 Test ");
	}
	public static void main(String arg[])
	{
	    System.out.println("main method ");

	}
	static
	{
	   System.out.println("static block2 Test");
	}
}