class Multi1
{
   static int x1=20,x2=10,x3=0;
   static void multi()
   {
        System.out.println("Multiplication1="+Multi1.x3);
   }
}
class Multi2
{
    static int x1=30,x2=40,x3=0;
    static void multi()
    {
         int x1=78,x2=9,x3=0;
          x3=x1*x2;
          System.out.println("Multi of local="+x3);
          Multi2.x3=Multi2.x1*Multi2.x2;
          System.out.println("Multi of static="+Multi2.x3);
          Multi1.x3=Multi1.x1*Multi1.x2;
    }
    public static void main(String args[])
    {
         multi();
         Multi1.multi();
    }
}