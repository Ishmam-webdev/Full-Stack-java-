class A
{
	static int show(int a, int b)
	{
		int k;
		k=a+b;
		return k;
	}
}

class Test
{
	public static void main(String args[])
	{
		int a;
		a=5;
		int b;
		b=10;
		 int res=A.show(a, b);
		 System.out.println(+res);
	}
}