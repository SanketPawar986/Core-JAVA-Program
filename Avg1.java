class Avg1
{
     static int sum=0;
     static float avg=0.0f;
     static void m1()
     {
          int count=0;
          for(int i=7;i<13;i++)
          {
              count++;
              Avg1.sum+=i;
          }
          Avg1.avg=Avg1.sum/count;
          System.out.println("Average="+Avg1.avg);
     }
     public static void main(String args[])
     {
         Avg1.m1();
     }
}