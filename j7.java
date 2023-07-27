class j7
{
    j7()
    {  
         this(10);
         System.out.println("Default Contructor of class j7");
    }
    j7(int x)
    {   
         this(x,20);
         System.out.println("one argument constructor of class j7="+x);
    }
    j7(int x1,int x2)
    {
         System.out.println("Two argument constructor of class j7="+x2);
    }
}
class j8 extends j7
{
    j8()
    {
         System.out.println("Default constructor of class j8");
    }
    j8(String s1)
    {
         System.out.println("One Argument constructor="+s1);
    }
    j8(String s1,String s2)
    {
         System.out.println("Two Argument constructor="+s2);
    }
    public static void main(String args[])
    {
         new j8("HELLO","HI");
    }
}