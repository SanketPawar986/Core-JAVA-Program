class MethodOvermulti
{
    void multi(int x)
    {
         x*=x;
         System.out.println("Multiplication1="+x);
    }
    void multi(int x,int y) 
    {
         int z=x*y;
         System.out.println("Multiplication2="+z);
    }
    void multi(int x,int y,int z)
    {
         z=x*y;
         System.out.println("Multiplication3="+z);
    }
    void multi(int x,int y,int z,int l)
    {
         x*=y;
         z*=l;
         System.out.println("Multiplication4="+x);
         System.out.println("Multiplication5="+z); 
    }
    public static void main(String args[])
    {
         MethodOvermulti m=new MethodOvermulti();
         m.multi(10);
         m.multi(67,34);
         m.multi(978,543,0);
         m.multi(6,8,8,9);
    }
}