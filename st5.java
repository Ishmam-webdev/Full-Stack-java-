class A
{
	
	static 
	{
	   System.out.println("A class static block ");
	}
	static int x=10;
}
class Test
{
	
	public static void main(String arg[])
	{
	    System.out.println("main method ");
	    System.out.println(A.x);
	    
	}
	
}