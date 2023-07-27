class Instancefor1
{
     int sum=0;
     float avg=0.0f;
     void m1()
     {
        Instancefor1 I=new Instancefor1();
        int count=0;
        for(int i=17;i<37;i++)
        {
            count++;
            I.sum+=i;
        }
        I.avg=I.sum/count;
        System.out.println("Average="+I.avg);
     }
     public static void main(String aegs[])
     { 
        new Instancefor1().m1();
     }
}