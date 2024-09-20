class A
{
	private int x;
	A()
	{
		System.out.println("AC");
		x=10;
	}
	A(int x)
	{
		System.out.println("APC");
		this .x=x;
	}
	int getX() {
		return x;
	}
	void setX(int x) {
		this.x = x;
	}
	
}
class B
{
	int y;
	A ob;
	B() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("bc");
	}
	B(int y, A ob) {
		super();
		this.y = y;
		this.ob = ob;
	}
	int getY() {
		return y;
	}
	void setY(int y) {
		this.y = y;
	}
	A getOb() {
		return ob;
	}
	void setOb(A ob) {
		this.ob = ob;
	}
	
}
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A obj=new A();
       	 B ob=new B();
         B obj1=new B(20,obj);
      // System.out.println(obj1.y); //20
        System.out.println(obj1.getY());
       //System.out.println(obj1.ob.x);
       System.out.println(obj1.ob.getX());
       
       
       
	}

}