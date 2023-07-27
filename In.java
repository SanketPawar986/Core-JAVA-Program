class In
{
     void m1()
     {
        System.out.println("m1() of class A"); 
     }
     void m2() 
     {
        System.out.println("m2() of class A");
     }
}
class In2 extends In
{
     void m3() { System.out.println("m3() of class B"); }
     void m4() { System.out.println("m4() of class B"); }
     public static void main(String args[])
     { In2 i=new In2(); i.m1();i.m2();i.m3();i.m4(); }
}