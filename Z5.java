class Z5
{
    int add()
    {
        int x=10,y=30;
        x+=y;
        return x;
    }
}
class A extends Z5
{
     int add()
     {
        int x=100,y=200;
        x+=y;
        return x;
     }
}
class B
{
     Z5 m1()
     {
        Z5 z=new Z5();
        return z;
     }
}
class C extends B
{
     B m1()
     {
        A a=new A();
        return a;
     }
}
class Test
{
     public static void main(String args[])
     {
         
     }
}