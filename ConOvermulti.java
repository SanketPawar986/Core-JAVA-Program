class ConOvermulti
{
     int z;
     ConOvermulti(int x,int y)
     {
          this.z=x*y;
          System.out.println("Multi1="+this.z);
     }
     ConOvermulti(int x,int y,int z)
     {
          z=x*y;
          System.out.println("Multi2="+z);
     }
     public static void main(String args[])
     {
         new ConOvermulti(7,8);new ConOvermulti(87,43);
     }
}