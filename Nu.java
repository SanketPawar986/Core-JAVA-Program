class Nu
{
   int x=30;
   void m1()
   {
      try
      {
         Nu n=null;
         System.out.println(n.x);
      }
      catch(NullPointerException ne)
      {
         System.out.println("Please add Object");
      }
   }
   public static void main(String args[])
   {
      Nu n=new Nu();
      n.m1();
   }
}