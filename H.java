class H
{
   int x=35;
   static int y=45;
}
class H2
{
   void m1()
   {
       System.out.println("x="+new H().x);
   }
   static void m2()
   {
       System.out.println("y="+H.y);
   }
   public static void main(String args[])
   {
       H2 h=new H2();
       h.m1();
       h.m2();
   }
}