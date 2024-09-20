class A
{
   private int x;
   void initA()
   {
   	x=10;
   }
   void show()
   {
   	System.out.println(x);
   }

}
class B  extends A
{
    private int y;
    void initB()
    {
    	y=20;
    }
    void disp()
    {
    	System.out.println(y);
    }
    
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	   ob.initA();
	   //ob.initB();
	    ob.show();
	    ob.disp();
	    
	   
	}
}