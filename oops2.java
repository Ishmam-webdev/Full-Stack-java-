 class Test {
      void show()
      {
        System.out.println("show nonstatic method ");
      }
      public static void main(String[] args) {
            // TODO Auto-generated method stub
         System.out.println("main method ");
       //  show();// by directly  better error
        // Test.show();// by classname  error
         new Test().show(); //by nameless object 
         Test t=new Test();
         t.show();//by object refernce 
         
         
      }

}