class Object
{
    int x=30;
    void m1()
    {
        System.out.println(new Object().x);
    }
    public static void main(String args[])
    {
        Object a=new Object();
        a.m1();
    }
}