class A
{
	private int x=10;
	private void f1()
	{
	   System.out.println("f1 method ");
	}
	void f3()
	{
		f1();
		System.out.println(x);

	}
}
class B  extends A
{
    int y=20;
     void f2()
     {
     	//f1(); error
     	  System.out.println("f2 method ");
     	 
      
     }
	
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    
	    ob.f3();
	    ob.f2();
	    System.out.println(ob.y);

	}
}