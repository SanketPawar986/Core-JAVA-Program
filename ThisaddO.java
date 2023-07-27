class ThisaddO
{
   int x1=400,y1=800,z1=0;
   void add()
   {
        int x1=7000,y1=9897,z1=0;
        z1=x1+y1;
        System.out.println("Value of Local Variable="+z1);
        this.z1=this.x1+this.y1;
        System.out.println("Value of Instance Variable="+this.z1);
   }
   void m1()
   {    
        add();
   }
   public static void main(String args[])
   {
        ThisaddO a=new ThisaddO();
        a.m1();
   }
}