class Nested
{
    static void max(int a,int b)
    {
         if(a==b)
         {
             System.out.println("both no. are equal a="+ a + "b" + b);
         }
         else
         {
             if(a>b)
             {
                 System.out.println("a is maximum="+a);
             }
             else
             {
                 System.out.println("b is maximum="+b);
             }
         }
    }
    public static void main(String args[])
    {
        max(10,20);
        max(20,10);      
        max(10,10);
        max(20,20);
    }
}