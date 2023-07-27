class COm
{
   int z1;
   float z2;
   COm(int x,int y)
   {
       z1=x*y;
       System.out.println("Multi1="+z1);
   }
   COm(float x,float y)
   {
       z2=x*y;
       System.out.println("Multi2="+z2);
   }
   public static void main(String args[])
   {
       new COm(7,89);
       new COm(2.2f,45.7f);
   }
}