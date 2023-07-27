class InstanceDo
{
    int sum=0;
    float avg=0.0f;
    void m1()
    {
        InstanceDo d=new InstanceDo();
        int count=0;
        int i=8;
        do
        { 
           count++;
           d.sum+=i;
           i++;
        }while(i<20);
        d.avg=d.sum/count;
        System.out.println("Average="+d.avg);
    }
    public static void main(String args[])
    {
        new InstanceDo().m1();
    }
}