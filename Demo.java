class Demo
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.add(30,12);
        d.add(20,22,30);
    }
}