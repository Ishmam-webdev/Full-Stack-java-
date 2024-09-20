class A
{
	int x,y;  //instance variable
	A(int x,int y)  //parameter constructor 
	{

      this.x=x; //implictly  this.x=p;
      this.y=y;  
	}
	A()  //default constructor
	{
		x=1;
		y=2;

	}
}
class Test
{

	public static void main(String arg[])
	{
        A ob=new A(10,20);
        System.out.println(ob.x+"  "+ob.y);
        A obj=new A();
         System.out.println(obj.x+"  "+obj.y);
         
	}
}