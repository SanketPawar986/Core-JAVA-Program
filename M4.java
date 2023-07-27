class M4
{
    int x=300;
    void m1()
    {
        System.out.println(new M4().x);
    }
    void m2()
    {
        M4 m=new M4();
        System.out.println(m.x);
        System.out.println(m.x);
    }
    public static void main(String args[])
    {
        new M4().m1();
        M4 m=new M4();
        m.m2();
    }
}