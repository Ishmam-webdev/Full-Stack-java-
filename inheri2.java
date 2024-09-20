class A
{
	int x=10;
	void f1()
	{
	   System.out.println("f1 method ");
	}
}
class B  extends A
{
    int y=20;
     void f2()
     {
         f1();
        System.out.println("f2 method ");
        System.out.println(x);
     }
	
}

class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.f2();
	    System.out.println(ob.y);
	}
}