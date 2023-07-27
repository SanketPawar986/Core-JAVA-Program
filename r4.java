class r4
{
     int x=10;
}
class r5 extends r4
{
     int x=100;
     void m1()
     {
          int x=1000;
          System.out.println("Local Variable access Directly="+x);
          System.out.println("Instance Variable of same class access using this="+this.x);
          System.out.println("Super class Instance Variable access using super keyword="+super.x);
     }
     public static void main(String args[])
     {
          new r5().m1();
     }
}