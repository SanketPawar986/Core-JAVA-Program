class W
{
    int x=56,y=36;
    int multi()
    {
       x*=y;
       return x;   
    }
}
class A extends W
{
    int multi()
    {
        super.x*=super.y;
        super.x*=super.x;
        return super.x;
    }
}
class B
{
    W m1()
    {
        W w=new W();
        return w;
    }
}
class C extends B
{
    A m1()
    {
        A a=new A();
        return a;
    }
}
class Test
{
    public static void main(String args[])
    {
         C c=new C();
         A a=c.m1();
         int z=a.multi();
         System.out.println("Multiplication="+z);
    }   
}