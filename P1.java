class P1
{
     void show()
     {
         System.out.println("A class");
     }
     void print()
     {
          System.out.println("print() method");
     }
}
class B extends P1
{
     void show()
     {
          System.out.println("B class");
     }
     void display()
     {
           System.out.println("display method");
     }
     public static void main(String args[])
     {
          B b=new B();
          b.show();
          b.display();
     }
}