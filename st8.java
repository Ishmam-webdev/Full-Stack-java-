class A
{
	private static int x;
	static 
	{
		x=10;
	   System.out.println("A class static block ");
	}
   static int getX()
   {
	   return x;
   }
	
}
class Test
{
	
	public static void main(String arg[])
	{
	    System.out.println("main method ");
	    System.out.println(A.getX());
	    System.out.println(Math.pow(2, 3));
	 
	}
	
}