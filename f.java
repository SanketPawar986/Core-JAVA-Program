class f
{
    int x=3000;
    void m1()
    {
        System.out.println(x);
    }
    void m2()
    {
         int x=78;
         System.out.println(x);
         System.out.println(this.x);
    }
    static void m3()
    {
         m1();
         this.m2();
    }
    public static void main(String args[])
    {
         new f().m3();
    }
}