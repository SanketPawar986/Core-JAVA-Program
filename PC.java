class PC
{
    PC(int x)
    {
        System.out.println("Parametrized Constructor="+x);
    }
    public static void main(String args[])
    {
        new PC(10);
    }
}