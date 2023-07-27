class Method1Arthimetic
{
    int x=10,y=20,z=0;
    void add()
    {   
        z=x+y;
        System.out.println("Addition="+z);
    }
    void sub()
    { 
        z=x-y;
        System.out.println("Subtraction="+z);
    }
    void multi()
    {
        z=x*y;
        System.out.println("Multiplication="+z);
    }
    void div()
    {
        z=x/y;
        System.out.println("Division="+z);
    }
    void mod()
    {
        z=x%y;
        System.out.println("Modulo="+z);
    }
    void disp()
    {
       add();
       sub();
       multi();
       div();
       mod();
    }
    public static void main(String args[])
    {
       Method1Arthimetic a=new Method1Arthimetic();
       a.disp();
    }
}