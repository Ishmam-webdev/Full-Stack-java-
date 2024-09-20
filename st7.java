class A
{
	
	static 
	{
	   System.out.println("A class static block ");
	}
	static int x=10;
	static void show()
	{
		System.out.println("static method show A "+x);
	}
}
class Test
{
	
	public static void main(String arg[])
	{
	    System.out.println("main method ");
	    A.show();
	    A.show();
	    
	}
	
}