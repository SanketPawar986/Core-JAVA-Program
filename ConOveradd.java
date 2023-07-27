class ConOveradd
{
     int z;
     ConOveradd(int x,int y)
     {
          this.z=x+y;
          System.out.println("Add1="+this.z);
     }
     ConOveradd(int x,int y,int z)
     {
          z=x+y;
          System.out.println("Add2="+z);
     }
     public static void main(String args[])
     {
          new ConOveradd(10,20);
          new ConOveradd(20,30,0);
     }
}