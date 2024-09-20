class A
{
   A(int x)
   {
   	System.out.println("para  Constructor "+x);
   }
  
}
class B extends A
{
    B()
    {
    	super(10);
    }
}
class Test
{
	public static void main(String arg[])
	{
	   
	   B ob=new B();
	}
}