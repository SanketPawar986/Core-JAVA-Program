class ConOversub
{
     int z;
     ConOversub(int x,int y)
     {
          this.z=x-y;
          System.out.println("Sub1="+this.z);
     }
     ConOversub(int x,int y,int z)
     {
          z=x-y;
          System.out.println("Sub2="+z);
     }
     public static void main(String args[])
     {
         new ConOversub(67,89);new ConOversub(897,463);
     }
}