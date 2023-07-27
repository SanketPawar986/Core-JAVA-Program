class me
{
   static void m1()
   {
      System.out.println("m1 of A");
   }
}
class B
{
   static void m1()
   {
        System.out.println("m1 of B");
   }
   static void m2()
   {
        System.out.println("m2 of B");
   }
   public static void main(String args[])
   {
        m1();
        m2();
        me.m1();
   }
}