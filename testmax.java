class testmax
{
    static void min(int a,int b)
    {
         if(a==b)
         {
             System.out.println("both no. are equal a="+ a + "b" + b);
         }
         else
         {
             if(a<b)
             {
                 System.out.println("a is minimum="+a);
             }
             else
             {
                 System.out.println("b is maximum="+b);
             }
         }
    }
    public static void main(String args[])
    {
        min(10,20);
        min(20,10);      
        min(10,10);
        min(20,20);
        min(8,5);
    }
}