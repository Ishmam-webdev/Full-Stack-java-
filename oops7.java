 class Test {
     
	void f1()
	{
		System.out.println("f1 non static method ");
		f2(); //directly 
		f3();// directly
		
	}
	void f2()
	{
		System.out.println("f2 non static method ");
	}
	static void f3()
	{
		System.out.println("f3 static method ");
	}
	public static void main(String[] args) {
		
        Test t=new Test();
        t.f1();
        
	}

}
