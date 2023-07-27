class Div007
{
    public static void m1(int w1,int w2)
    {
        try
        {
            int w3=w1/w2;
            System.out.println("Divison="+w3);
        }
        catch(ArithmeticException ae)
        {
           System.out.println("Do not pass second argument as zero");
        }
    }
    public static void main(String args[])
    {
        try
        {
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            m1(x,y);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Pass atleast two arrays");
        }
    }
}