class Ady1
{
   static int x1=20,x2=10,x3=0;
   static void add()
   {
        System.out.println("Addition1="+Ady1.x3);
   }
}
class Ady2
{
    static int x1=30,x2=40,x3=0;
    static void add()
    {
         int x1=78,x2=9,x3=0;
          x3=x1+x2;
          System.out.println("Add of local="+x3);
          Ady2.x3=Ady2.x1+Ady2.x2;
          System.out.println("Add of static="+Ady2.x3);
          Ady1.x3=Ady1.x1+Ady1.x2;
    }
    public static void main(String args[])
    {
         add();
         Ady1.add();
    }
}