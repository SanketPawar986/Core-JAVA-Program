class o
{
    int x=300;
    void m1()
    {
         System.out.println(x);
    }
    void m2()
    {
         int x=29;
         System.out.println(x);
         System.out.println(this.x);
    }
    static void m3()
    {
          o t=new o();
          t.m1();
          t.m2();
    }
    public static void main(String args[])
    {
          m3();
    }
}