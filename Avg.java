class Avg
{
    static int sum=0;
    static float avg=0.0f;
    static void m1()
    {
         int count=0;
         for(int i=0;i<5;i++)
         {
             count++;
             Avg.sum+=i;
         }
        Avg.avg=Avg.sum/count;
        System.out.println("Average="+Avg.avg);
    }
    public static void main(String args[])
    {
          Avg.m1();
     }
}