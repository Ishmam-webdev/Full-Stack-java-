class A
{
	int x,y;  //instance variable
	A()
	{
      System.out.println(x+"  "+y); // 0  0
      x=10;
      y=20;  
	}
}
class Test
{

	public static void main(String arg[])
	{
        A ob=new A();
        System.out.println(ob.x+"  "+ob.y);
         
	}
}