class Test_Exception
{
    static void m1(String s1,String s2)
    {
       try
       {
           int x=Integer.parseInt(s1);
           int y=Integer.parseInt(s2);
           int z=x+y;
           System.out.println("addition="+z);
       }
       catch(NumberFormatException ne)
       {
           System.out.println("Do not pass Sring or Char or put Integer values only");
       }
    }
    public static void main(String args[])
    {
       try
       {
          String s1=args[0];
          String s2=args[1];
          Test_Exception.m1(s1,s2);
       }
       catch(ArrayIndexOutOfBoundsException ae)
       {
           System.out.println("Pass Two Arguments");   
       }
    }
}