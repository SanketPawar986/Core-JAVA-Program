class COa
{
     int z1;
     float z2;
     COa(int x,int y)
     {
         this.z1=x+y;
         System.out.println("add1="+this.z1);
     }
     COa(float x,float y)
     {
         z2=x+y;
         System.out.println("add2="+z2);
     }
     public static void main(String args[]) 
     {
         new COa(7,8);
         new COa(2.2f,4.82f);
     }
}