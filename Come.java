class Come
{
     Come(float x,int y)
     {
         float z=x*y;
         System.out.println("Multi1="+z);
     }
     Come(int x,float y)
     {
         float z=x*y;
         System.out.println("Multi2="+z);
     }
     public static void main(String args[])
     {
         new Come(78.56f,78);
         new Come(37,87.93f);
     }
}