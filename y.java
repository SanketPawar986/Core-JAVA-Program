class y
{
    y(int x)
    {
        System.out.println("Parametrized const of A class="+x);
    }
}
class B extends y
{
    B()
    {
        System.out.println("default const of B class=");
    }
    public static void main(String args[])
    {
        new B();
    }
}