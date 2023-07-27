class TestDoLoop
{
    static void m1()
    {
        int i=0;
        do
        {
            System.out.println("hello"+i);
            i++;
        }while(i<9);
    }
    public static void main(String args[])
    {
        TestDoLoop.m1();
    }
}