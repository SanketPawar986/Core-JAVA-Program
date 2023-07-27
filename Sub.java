class Sub
{
   int x=78,y=89,z=0;
   void sub()
   {
       Sub s=new Sub();
       s.z=s.x-s.y;
       System.out.println("Subtraction="+s.z);
   }
   public static void main(String args[])
   {
       new Sub().sub();
   }
}