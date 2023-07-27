class suby1
{
   static int x1=20,x2=10,x3=0;
   static void sub()
   {
        System.out.println("Subtraction1="+suby1.x3);
   }
}
class suby2
{
    static int x1=30,x2=40,x3=0;
    static void sub()
    {
         int x1=78,x2=9,x3=0;
          x3=x1-x2;
          System.out.println("Sub of local="+x3);
          suby2.x3=suby2.x1-suby2.x2;
          System.out.println("Sub of static="+suby2.x3);
          suby1.x3=suby1.x1-suby1.x2;
    }
    public static void main(String args[])
    {
         sub();
         suby1.sub();
    }
}