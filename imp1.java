interface A
{
	int x=10; //public static final int x;
   final int y=20;//public static final int y=20;
   void show(); //public abstract void show();
   abstract int f1();//public abstract int f1();

   public abstract void f2(int a);


}

class B implements A
{
	public void show()
	{
		System.out.println("show method ");
	}
	public void f2(int a)
	{
		System.out.println("f2 method ");
	}
	public int f1()
	{
		System.out.println("f1 method ");
		return 0;
	}

}

class Test
{
	public static void main(String arg[])
	{
		//A ob=new A(); error
		A ob=new B();
		ob.show();
		ob.f2(10);
		System.out.println(ob.f1());
		System.out.println(ob.x+" "+ob.y);
		System.out.println(A.x+" "+A.y);
	}
}