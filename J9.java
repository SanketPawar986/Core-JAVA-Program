class J9
{
    J9()
    {  
         this(10);
         System.out.println("Default Contructor of class J9");
    }
    J9(int x)
    {   
         this(x,20);
         System.out.println("one argument constructor of class J9="+x);
    }
    J9(int x1,int x2)
    {
         System.out.println("Two argument constructor of class J9="+x1 +","+x2);
    }
}
class B extends J9
{
    B()
    {
         System.out.println("Default constructor of class B");
    }
    B(String s1)
    {
         this();
         System.out.println("One Argument constructor="+s1);
    }
    B(String s1,String s2)
    {
         this(s1);
         System.out.println("Two Argument constructor="+s1 +","+s2);
    }
    public static void main(String args[])
    {
         new B("Hii","Hello");
    }
}