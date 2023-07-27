class Div
{
   int x=78,y=5,z=0;
   void div()
   {
       Div d=new Div();
       d.z=d.x/d.y;
       System.out.println("Division="+d.z);
   }
   public static void main(String args[])
   {
       Div d=new Div();
       d.div();
       d.div();
       d.div();
   }
}