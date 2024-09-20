class A
{
	void f2()
	{
		System.out.println("f2 is a non static method");
	}
	static void f3()
	{
		System.out.println("f3 is a static method");
	}
}
class Test
{
	void f1()
	{
		System.out.println("f1 is also a non static method");
		A A1=new A();
		A1.f2();
		A.f3();
	}
	public static void main(String args[])
	{
		Test ob=new Test();
		ob.f1();
	} 

}