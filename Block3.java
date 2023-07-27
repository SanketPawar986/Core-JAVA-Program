class Block3
{
   Block3()
   {
       System.out.println("Default Constructor");
   }
   {
       System.out.println("Block1");
   }
   void m1()
   {
       System.out.println("m1 method");
   }
   {
       System.out.println("Block2");
   }
   void m2()
   {
       System.out.println("m2 method");
   }
   {
       System.out.println("Block3");
   }
   void m3()
   {
       System.out.println("m3 method");
   }
   {
       System.out.println("Block4");
   }
   void m4()
   { 
       System.out.println("m4 method");
   }
   {
       System.out.println("Block5");
   }
   public static void main(String args[])
   {
       Block3 b=new Block3();
       b.m1();
       b.m2();
       b.m3();
       b.m4();
   }
   {
       System.out.println("Block6");
   }
}