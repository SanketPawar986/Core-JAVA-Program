class ADD
{
   int x=30,y=40,z=0;
   void add()
   {
       ADD a=new ADD();
       a.z=a.x + a.y;
       System.out.println("Addition="+a.z);
   }
   public static void main(String args[])
   {
       new ADD().add();
   }
}