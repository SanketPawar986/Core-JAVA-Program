class M
{
    int x1=20,x2=30,x3=40;
    void m1()
    {
        System.out.println("Value of x1="+this.x1);
    }
    void m2()
    {
        System.out.println("Value of x2="+this.x2);
    }
    void m3()
    {
        System.out.println("Value of x3="+this.x3);
    }
    void m4()
    {
        this.m1();
        this.m2();
        this.m3();
    }
    public static void main(String args[])
    {
        M m=new M();
        m.m4();
        m.m4();
    }
}