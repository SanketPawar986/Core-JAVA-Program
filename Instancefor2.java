class Instancefor2
{
    int sum=0;
    float avg=0.0f;
    void m1()
    {
        Instancefor2 f=new Instancefor2();
        int count=0;
        for(int i=37;i>=17;i--)
        {
            count++;
            f.sum+=i;
        }
        f.avg=f.sum/count;
        System.out.println("Average="+f.avg);
     }
     public static void main(String args[])
     {
         new Instancefor2().m1();
     }
}