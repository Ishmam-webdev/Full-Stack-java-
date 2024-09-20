import java.util.Scanner;
class A
{
	 void show()
     {
   	  System.out.println("show static method ");
     }
}
class Test {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main method ");
       //  show();  error
        //A.show(); //error by classname 
       
         new A().show(); //by nameless object
         A ob=new A();
         ob.show(); //by object refernce 
         Scanner sc=new Scanner(System.in);
         int no=sc.nextInt();
         
	}

}