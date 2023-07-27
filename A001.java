class A001
{
   int a[]={10,20,30};
   void m1()
   {
       try
       {
            for(int i=0;i<=a.length;i++)
            {
                System.out.println(this.a[i]);
            }
       }
       catch(ArrayIndexOutOfBoundsException ae)
       {
            System.out.println(ae);
       }
   }
   public static void main(String args[])
   {
      A001 a=new A001();
      a.m1();
   }
}