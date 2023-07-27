class DCf
{
    float x,y,z;
    DCf()
    {
       x=20.12f;y=3.26f;
       z=x*y;
       System.out.println("Multiplication="+z);
    }
    public static void main(String args[])
    {
        new DCf();
    }
}