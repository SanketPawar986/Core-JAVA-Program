class TestDoLoop0
{
    static int sum=1;
    static void m1()
    {
         int i=1;
         do
         {
            TestDoLoop0.sum=TestDoLoop0.sum * i;
            System.out.println("sum="+TestDoLoop0.sum);
            i++;
         }while(i<10);
    }
    public static void main(String args[])
    {
        TestDoLoop0.m1();
    }
}