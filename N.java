class N
{
    int x1=20,x2=30,x3=40;
    void m1()
    {
        int x1=300;
        System.out.println("value of x1="+x1);
        System.out.println("Value of x1 Instance Variable="+this.x1);
    }
    void m2()
    {
        int x2=400;
        System.out.println("value of x2="+x2);
        System.out.println("Value of x2 Instance Variable="+this.x2);
    }
    void m3()
    {
        int x3=1000;
        System.out.println("value of x3="+x3);
        System.out.println("Value of x3 Instance Variable="+this.x3);
    }
    void m4()
    {
        m1();
        m2();
        m3();
    }
    public static void main(String args[])
    {
        N n=new N();
        n.m4();
        n.m4();
    }
}