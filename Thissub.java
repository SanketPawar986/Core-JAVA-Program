class Thissub
{
   int x1=789,y1=990,z1=0;
   void sub()
   {
       int x1=8763,y1=5342,z1=0;
       z1=x1-y1;
       System.out.println("Value of Local Variable="+z1);
       this.z1=this.x1-this.y1;
       System.out.println("Value of Instance Variable="+this.z1);
   }
   void m1()
   {
        sub();
   }
   public static void main(String args[])
   {
       new Thissub().m1();
   }
}