class Square
{
	private int  L;
	Square(int L)  //parameter constructor 
	{
         this.L=L;
    }
	Square()  //default constructor
	{
		L=1;
	
	}
    void disp()
    {
    	System.out.println("length="+L);
    }
    void area()
    {
    	int ar;
    	ar=L*L;
    	System.out.println("area of Square="+ar);
    }
    int perimeter()
    {
    	int pr;
    	pr=4*L;
    	return pr;
    }
}
class Test
{

	public static void main(String arg[])
	{
      Square r1=new Square();
      r1.disp();
      r1.area();
      Square r2=new Square(4);
       r2.disp();
       r2.area();
       System.out.println("perimeter of Square="+r2.perimeter());  
	}
}