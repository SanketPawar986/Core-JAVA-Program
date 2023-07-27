class J
{
    int x1=20,x2=30,x3=40;
    void m1()
    {
        System.out.println("Value of x1="+x1);
    }
    void m2()
    {
        System.out.println("Value of x2="+x2);
    }
    void m3()
    {
        System.out.println("Value of x3="+x3);
    }
    void m4()
    {
        this.m1();
        this.m2();
        this.m3();
    }
    public static void main(String args[])
    {
        J j=new J();
        j.m4();
        j.m4();
    }
}