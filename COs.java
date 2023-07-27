class COs
{
     int z1;
     float z2;
     COs(int x,int y)
     {
         this.z1=x-y;
         System.out.println("sub1="+this.z1);
     }
     COs(float x,float y)
     {
         z2=x-y;
         System.out.println("sub2="+z2);
     }
     public static void main(String args[]) 
     {
         new COs(27,16);
         new COs(10.8f,7.2f);
     }
}