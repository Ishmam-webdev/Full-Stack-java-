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
	public static void main(String arg[]) throws ClassNotFoundException
	{
	    System.out.println("main method ");
	    Class.forName("A");
	}
	static
	{
	   System.out.println("static block2 Test");
	}
}