class T
{
   int x=30;
   void m1()
   {   
       System.out.println("value of x="+this.x);
   }
   public static void main(String args[])
   {
       T t=new T();
       t.m1();
   }
}