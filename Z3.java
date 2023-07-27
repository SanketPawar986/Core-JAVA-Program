class Z3
{
     float add()
     {
         float x=67.78f,y=78.20f,z=0f;
         z=x+y;
         return z;
     }
}
class Z4 extends Z3
{
     float add()
     {
         float x=50.90f,y=77.80f,z=0f;
         z=x+y;
         return z;
     }
     public static void main(String args[])
     {
         float w;
         w=new Z4().add();
         System.out.println("Add="+w);
     }
}