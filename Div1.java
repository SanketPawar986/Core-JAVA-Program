class Div1
{
   static int x1=20,x2=10,x3=0;
   static void div()
   {
        System.out.println("Division1="+Div1.x3);
   }
}
class Div2
{
    static int x1=76,x2=4,x3=0;
    static void div()
    {
         int x1=89,x2=5,x3=0;
          x3=x1/x2;
          System.out.println("Div of local="+x3);
          Div2.x3=Div2.x1/Div2.x2;
          System.out.println("Div of static="+Div2.x3);
          Div1.x3=Div1.x1/Div1.x2;
    }
    public static void main(String args[])
    {
         div();
         Div1.div();
    }
}