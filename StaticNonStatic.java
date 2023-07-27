class StaticNonStatic
{
    static
    {    
        System.out.println("Static Block1");
    }
    {
        System.out.println("Block1");
    }
    StaticNonStatic()
    {
        System.out.println("Default Constructor");
    }
    static
    {
        System.out.println("Static Block2");
    }
    {    
        System.out.println("Block2");
    }
    void m1()
    {
        System.out.println("m1 method");
    }
    static
    {
        System.out.println("Static Block3");
    }
    {
        System.out.println("Block3");
    }
    public static void main(String args[])
    {
        System.out.println("Main Started");
        new StaticNonStatic().m1();
        System.out.println("Main End");
    }
    static 
    {
       System.out.println("Static Block4");
    }
    {
       System.out.println("Block4");
    }
}