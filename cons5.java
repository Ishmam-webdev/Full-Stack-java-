class A
{
	int x,y;  //instance variable
	A(int p,int q)  //parameter constructor 
	{

      x=p;  //implictly  this.x=p;
      this.y=q;  
	}
}
class Test
{

	public static void main(String arg[])
	{
        A ob=new A(10,20);
        System.out.println(ob.x+"  "+ob.y);
        A obj=new A(30,40);
         System.out.println(obj.x+"  "+obj.y);
         
	}
}