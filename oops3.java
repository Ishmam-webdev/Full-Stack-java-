class A
{
	 static void show()
     {
   	  System.out.println("show static method ");
     }
}
 class Test {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main method ");
       //  show();  error
        A.show(); // by classname 
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));
         new A().show(); //not good
         A ob=new A();
         ob.show(); //by object refernce 
         }
	}


