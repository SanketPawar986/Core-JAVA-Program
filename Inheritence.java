class Inheritence
{
     void m1()
     {
         System.out.println("It is m1() of class A");
     }
     void m2()
     {
         System.out.println("It is m2() of class A");
     }
}
class Inheritence2 extends Inheritence
{
     void m3()
     {
         System.out.println("It is m3() of class B");
     }
     void m4()
     {
         System.out.println("It is m4() of class B");
     }
     public static void main(String args[])  
     {
         Inheritence2 i=new Inheritence2();
         i.m1();
         i.m2();
         i.m3();
         i.m4();
     }
}