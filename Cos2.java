class Cos2
{
     Cos2(float x,int y)
     {
         float z=x-y;
         System.out.println("Sub1="+z);
     }
     Cos2(int x,float y)
     {
         float z=x-y;
         System.out.println("Sub2="+z);
     }
     public static void main(String args[])
     {
         new Cos2(78.56f,78);
         new Cos2(37,87.93f);
     }
}