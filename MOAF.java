class MOAF
{
   void add(float x)
   {
       x+=x;
       System.out.println("Add1="+x);
   }
   void add(float x,float y)
   {
       x+=y;
       System.out.println("Add2="+x);
   }
   void add(float x,float y,float z)
   {
       z=x+y;
       System.out.println("Add3="+z);
   }
   public static void main(String args[])
   {
       MOAF a=new MOAF();
       a.add(6.7f,7.8f);
       a.add(67.90f,45.89f);
       a.add(35.78f,47.78f,0.0f);
   }
}