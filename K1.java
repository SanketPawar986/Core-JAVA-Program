class K1
{
   void add()
   {
       int x=20,y=30,z=0;
       z=x+y;
       System.out.println("Addition="+z);
   }
}
class K2 extends K1
{
    void add()
    {
       int x=1000,y=2000,z=0;
       z=x+y;
       System.out.println("Addition2="+z);
    }
    public static void main(String args[])
    {
       new K2().add();
       new K1().add();
    }
} 