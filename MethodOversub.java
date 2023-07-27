class MethodOversub
{
    void sub(int x,int y)
    {
         int z=x-y;
         System.out.println("Subtraction1="+z);
    }
    void sub(int x,int y,int z) 
    {
         z=x-y;
         System.out.println("Subtraction2="+z);
    }
    public static void main(String args[])
    {
         MethodOversub s=new MethodOversub();
         s.sub(67,34);
         s.sub(978,543);
    }
}