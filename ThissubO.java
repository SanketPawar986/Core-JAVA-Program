class ThissubO
{
   float x1=89.78f,y1=79.08f,z1=0.0f;
   void sub()
   {
       float x1=54.63f,y1=23.42f,z1=0.0f;
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
       new ThissubO().m1();
   }
}