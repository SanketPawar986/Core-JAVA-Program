class Z1
{
     int add()
     {
         int x=10,y=20,z=0;
         z=x+y;
         return z;
     }
}
class Z2 extends Z1
{
     int add()
     {
         int x=500,y=700,z=0;
         z=x+y;
         return z;
     }
     public static void main(String args[])
     {
         int w;
         w=new Z2().add();
         System.out.println("Add="+w);
     }
}