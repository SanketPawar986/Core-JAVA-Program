class Block
{
    int sum=0;
    void m1(int x1)
    {
        int x2=30;
        Block a=new Block();
        for(int i=0;i<3;i++)
        {
            a.sum=a.sum+i;
        }
        System.out.println("value of x1="+x1);
        System.out.println("value of x2="+x2);
        System.out.println("Sum="+a.sum);
    }
    public static void main(String args[])
    {
        new Block().m1(10);
    }
}
