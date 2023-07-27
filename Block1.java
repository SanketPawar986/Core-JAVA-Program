class Block1
{
    Block1()
    {
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Block 1");
    }
    void m1()
    {
        System.out.println("m1 method");
    }
    {
        System.out.println("Block 2");
    }
    void m2()
    {
        System.out.println("m2 method");
    }
    {
        System.out.println("Block 3");
    }
    public static void main(String args[])
    {
        Block1 a=new Block1();
        a.m1();
        a.m2();
    }
    {
        System.out.println("Block 4");
    }
}