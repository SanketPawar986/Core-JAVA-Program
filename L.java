class L
{ 
   static int x=100;
}
class M
{ 
   static int x=1000;
   static void m1()
   {
       int x=30000;
       System.out.println("local variable access directly="+x);
       System.out.println("class variable access by using class Name="+M.x);
       System.out.println("class variable access by using class Name="+L.x);
   }
   public static void main(String args[])
   {
       m1();
   } 
}