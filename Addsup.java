class Addsup
{
     int x=50,y=40,z=0;
}
class B extends Addsup
{
     int x=60,y=30,z=0;
     void add()
     {
          int x=30,y=90,z=0;
          z=x+y;
          this.z=this.x+this.y;
          super.z=super.x+super.y;
          System.out.println("Local Variable="+z);
          System.out.println("instance variable add="+this.z);
          System.out.println("Super class instance variable="+super.z);
     }
     void m1()
     {   
          add();
          this.add();
     }
     public static void main(String args[])
     {
          new B().m1();
     }
}
