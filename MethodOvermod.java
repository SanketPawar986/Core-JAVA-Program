class MethodOvermod
{
    void mod(int x,int y)
    {
         int z=x%y;
         System.out.println("mod1="+z);
    }
    void mod(int x,int y,int z) 
    {
         z=x%y;
         System.out.println("mod2="+z);
    }
    public static void main(String args[])
    {
         MethodOvermod s=new MethodOvermod();
         s.mod(67,34);
         s.mod(978,543);
    }
}