class Rectangle
{
	private int  L,B;
	Rectangle(int L,int B)  //parameter constructor 
	{
         this.L=L;
         this.B=B;
    }
	Rectangle()  //default constructor
	{
		L=1;
		B=1;
	}
    void disp()
    {
    	System.out.println("length="+L);
    	System.out.println("breadth="+B);
    }
    void area()
    {
    	int ar;
    	ar=L*B;
    	System.out.println("area of rectangle="+ar);
    }
    int perimeter()
    {
    	int pr;
    	pr=2*(L+B);
    	return pr;
    }
}
class Test
{

	public static void main(String arg[])
	{
      Rectangle r1=new Rectangle();
      r1.disp();
      r1.area();
      Rectangle r2=new Rectangle(4,5);
       r2.disp();
       r2.area();
       System.out.println("perimeter of rectangle="+r2.perimeter());  
	}
}