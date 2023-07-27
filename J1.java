class J1
{
    static int w1=200;
    static void m1()
    {
         int w1=2000;
         System.out.println(w1);
         System.out.println(J1.w1);
    }
}
class J2
{
    static int w1=3000;
    static void m1()
    {
         System.out.println(J1.w1);
         System.out.println(J2.w1);
    }
    public static void main(String args[]) 
    {
         J1.m1();
         m1();
    }
}