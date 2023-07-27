class Forloop0
{
    static int sum=0;
    static void m1()
    {
        for(int i=0;i<5;i++)
        {
           sum=sum+i;
           System.out.println("sum="+sum);
        }
    }
    public static void main(String args[])
     {
        Forloop0.m1();
     }
}