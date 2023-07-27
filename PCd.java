class PCd
{
    double x,y,z;
    PCd()
    {
       x=20.12;y=3.26;
       z=x*y;
       System.out.println("Multiplication="+z);
    }
    public static void main(String args[])
    {
        new PCd();
    }
}