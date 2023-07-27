class Addition1
{
   static int x1=100,y1=200,z1=0;
   static void add()
   {
       z1=x1+y1;
       System.out.println("Addition="+z1);
   }
}
class Addition2
{  
    static void add()
    {
        Addition1.z1=Addition1.x1+Addition1.y1;
        System.out.println("Addition="+Addition1.z1);
    }
    public static void main(String args[])
    {
         Addition1.add();
         Addition2.add();
         add();
    }
}