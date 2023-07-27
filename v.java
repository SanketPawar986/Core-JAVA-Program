class v
{
    v()
    {
        System.out.println("Default Constructor");
    }
    v(int x1)
    {
        this();
        x1+=x1;
        System.out.println("1 argument costructor="+x1);
    }
    v(int x1,int x2)
    {
        this(x1);
        int z=x1+x2;
        System.out.println("2 aargument Constructor="+z);
    }
    v(int x1,int x2,int x3)
    {
        this(x1,x2);
        int z=x1+x2+x3;
        System.out.println("3 Argument Constructor="+z);
    }
    v(int x1,int x2,int x3,int x4)
    {
        this(x1,x2,x3);
        int z=x1+x2+x3+x4;
        System.out.println("4 Argument Conctructor="+z);
    }
    v(int x1,int x2,int x3,int x4,int x5)
    {
        this(x1,x2,x3,x4);
        int z=x1+x2+x3+x4+x5;
        System.out.println("5 Argument Constructor="+z);
    }
    public static void main(String aargs[])
    {
        new v(10,20,90,30,40);
    }
}