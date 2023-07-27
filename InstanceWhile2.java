class InstanceWhile2
{
     int sum=0;
     float avg=0.0f;
     void m1()
     {
        InstanceWhile2 w=new InstanceWhile2();
        int count=0;
        int i=17;
        while(i>=5)
        {
            count++;
            w.sum+=i;
            i--;
        } 
        w.avg=w.sum/count;
        System.out.println("Average="+w.avg);
     }
     public static void main(String args[])
     {
         new InstanceWhile2().m1();
     }
}