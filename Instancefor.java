class Instancefor
{
    int sum=0;
    float avg=0.0f;
    void m1()
    {
        Instancefor l=new Instancefor();
        int count=0;
        for(int i=0;i<5;i++)
        {
           count++;
           l.sum+=i;
        }
        l.avg=l.sum/count;
        System.out.println("Average="+l.avg);
    }
    public static void main(String args[])
    {
        new Instancefor().m1();
    }
}