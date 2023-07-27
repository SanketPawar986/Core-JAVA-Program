class PCsub
{
    int x,y,z;
    PCsub(int x,int y)
    {
         this.x=x;
         this.y=y;
         z=x-y;
         System.out.println("Subtraction="+z);
    }
    public static void main(String args[])
    {
         new PCsub(89,34);
    }
}