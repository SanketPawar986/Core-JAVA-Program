class Q
{
    Q()
    {
       System.out.println("Default Constructor");
    }
    Q(int x1)
    {
       new Q();
       x1+=x1;
       System.out.println("1 Argument Constructor="+x1);
    }
    Q(int x1,int x2)
    {
        new Q(x1);
        int z=x1+x2;
        System.out.println("2 Argument Constructor="+z);
    }
    Q(int x1,int x2,int x3)
    {
        new Q(x1,x2);
        int z=x1+x2+x3;
        System.out.println("3 Argument Constructor="+z);
    }
    Q(int x1,int x2,int x3,int x4)
    {
        new Q(x1,x2,x3);
        int z=x1+x2+x3+x4;
        System.out.println("4 Argument Constructor="+z);
    }
    Q(int x1,int x2,int x3,int x4,int x5)
    {
        new Q(x1,x2,x3,x4);
        int z=x1+x2+x3+x4+x5;
        System.out.println("5 Argument Constructor="+z);
    }
    public static void main(String args[])
    {
        new Q(10,20,40,50,60);
    }
}
 