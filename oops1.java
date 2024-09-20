 class Test {
      static void show()
      {
        System.out.println("show static method ");
      }
      public static void main(String[] args) {
            // TODO Auto-generated method stub
         System.out.println("main method ");
         show();// by directly  better
         Test.show();// by classname
         new Test().show(); //by nameless object 
         Test t=new Test();
         t.show();//by object refernce        
      }
}

 /*class oops
 {
      static void show()
      {
            System.out.println("Raza");
      }
      public static void main(String args[])
      {
            System.out.println("Ishmam");
            show();
            oops.show();
            new oops().show();
            oops i=new oops();
            i.show();


      }
 }*/


