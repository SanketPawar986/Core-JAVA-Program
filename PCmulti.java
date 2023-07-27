class PCmulti
{
   int x,y,z;
   PCmulti(int x,int y)
   {
       this.x=x;
       this.y=y;
       z=x*y;
       System.out.println("Multiplication="+z);
   }
   public static void main(String args[])   
   {
       new PCmulti(56,89);
   }
}