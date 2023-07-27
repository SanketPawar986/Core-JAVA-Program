class Multiplication1
{ 
    static int x1=899,y1=6,z1=0;
    static void multi()
    {
        z1=x1*y1;
        System.out.println("Multiplication="+z1);
    }
}
class Multiplication2
{
    static void multi()
    {
         Multiplication1.z1=Multiplication1.x1*Multiplication1.y1;
         System.out.println("Multiplication="+Multiplication1.z1);
    }
    public static void main(String args[])
    { 
         Multiplication1.multi();
         Multiplication2.multi();
         multi();
    }
}