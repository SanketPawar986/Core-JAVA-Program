class Q1
{
    int x=89,y=42;
    int sub()
    {
        x-=y;
        return x;
    }
}
class A extends Q1
{
    int sub()
    {
        super.x-=super.y;
        super.x+=super.x;
        return super.x;
    }
}
class B
{
    Q1 m1()
    {
        Q1 q=new Q1();
        return q;
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
         int z=a.sub();
         System.out.println("Subtraction="+z);
    }
}