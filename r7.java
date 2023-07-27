class r7
{
    r7()
    {
        System.out.println("Default constructor of r7");
    }
}
class B extends r7
{
    B()
    {
        System.out.println("Default constructor of B");
    }
    public static void main(String args[]) 
    {
        new B();
    }
}