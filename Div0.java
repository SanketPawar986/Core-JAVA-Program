class Div0
{
    public static void main(String args[])
    {
       try
       {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x/y;
        System.out.println("division="+z);
       }
       catch(ArithmeticException ae)
       {
           System.out.println("do not pass second argument as zero");
       }
    }
}