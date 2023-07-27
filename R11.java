class R11
{
     int x=30,y=40;
     int add()
     {
         x+=y;
         return x;
     }
}
class R12 extends R11
{
     int add()
     {
         super.x+=super.y;
         super.x+=super.x;
         return super.x;
     }
}
class R13
{
     R11 m1()
     { 
         R11 r=new R11();
         return r;
     }
}
class R14 extends R13
{   
     R12 m1()
     {
         R12 b=new R12();
         return b;
     }
}
class Test
{
     public static void main(String args[])
     {
          R14 f=new R14();
          R12 b=f.m1();
          int z=b.add();
          System.out.println("Addition="+z);
     }
}