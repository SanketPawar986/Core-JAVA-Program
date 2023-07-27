class StaticBlock
{
   StaticBlock()
   {
        System.out.println("Default Constructor"); 
   }
   static
   {
        System.out.println("Static Block1");
   }
   void m1()
   {
        System.out.println("m1 method");
   }
   static
   {
        System.out.println("Static Block2");       
   }
   void m2()
   {
        System.out.println("m2 method");
   }
   static
   {
        System.out.println("Static Block3");
   }
   public static void main(String args[]) 
   {
        StaticBlock s=new StaticBlock();
        s.m1();
        s.m2();
   }
}