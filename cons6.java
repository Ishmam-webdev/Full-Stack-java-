class A
{
	void A()
	{
         System.out.println("AC");
	}
}
class Test
{

	public static void main(String arg[])
	{
        A ob=new A();
       // ob.A(); you need to call through object referance
        A obj=new A();
        A obj1=new A();
        new A();  //nameless object 
	}
}