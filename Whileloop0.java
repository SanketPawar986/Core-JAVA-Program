class Whileloop0
{
    static int sum=0;
    static void m1()
    {
        int i=0;
        while(i<8)
        {
           sum=sum+i;
           System.out.println("sum="+sum);
           i++;
        }
    }
    public static void main(String args[])
    {
        Whileloop0.m1();
    }
}