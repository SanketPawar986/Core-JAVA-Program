class Subtraction1
{
    static int x1=100,y1=200,z1=0;
    static void sub()
    {
        z1=x1-y1;
        System.out.println("Subtraction="+z1);
    }
}
class Subtraction2
{
    static void sub()
    {
        Subtraction1.z1=Subtraction1.x1-Subtraction1.y1;
        System.out.println("Subtraction="+Subtraction1.z1);
    }
    public static void main(String args[])
    { 
        Subtraction1.sub();
        Subtraction2.sub();
        sub();
    }
}