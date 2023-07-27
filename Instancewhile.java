class Instancewhile
{
    int sum=0;
    float avg=0.0f;
    void m1()
    {
        Instancewhile w=new Instancewhile();
        int count=0;
        int i=0;
        while(i<7)
        {
            count++;
            w.sum+=i;
            i++;
        }
        w.avg=w.sum/count;
        System.out.println("Average="+w.avg);
    }
    public static void main(String args[])
    {
        new Instancewhile().m1();
    }
}