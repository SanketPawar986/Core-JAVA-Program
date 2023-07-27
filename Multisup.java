class Multisup
{
     int x=30,y=40,z=0;
}
class B extends Multisup
{
     int x=6,y=30,z=0;
     void multi()
     {
          int x=34,y=90,z=0;
          z=x*y;
          this.z=this.x*this.y;
          super.z=super.x*super.y;
          System.out.println("Local Variable="+z);
          System.out.println("instance variable add="+this.z);
          System.out.println("Super class instance variable="+super.z);
     }
     void m1()
     {   
          multi();
          this.multi();
     }
     public static void main(String args[])
     {
          new B().m1();
     }
}
