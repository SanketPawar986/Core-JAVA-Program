class InstanceDo2
{
     int sum=0;
     float avg=0.0f;
     void m1()
     {
        InstanceDo2 d=new InstanceDo2();
        int count=0;
        int i=78;
        do
        {
           count++;
           d.sum+=i;
           i--;
        }while(i>=0);
        d.avg=d.sum/count;
        System.out.println("Average="+d.avg);
     }
     public static void main(String args[])
    {
        new InstanceDo2().m1();
    }
}