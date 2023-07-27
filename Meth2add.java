class Meth2add
{
   static int x1=20,x2=10,x3=0;
   static int add()
   {
        return Meth2add.x3;
   }
}
class Meth2add2
{
    static int x1=30,x2=40,x3=0;
    static int add()
    {
         int x1=78,x2=9,x7=0;
          x7=x1+x2;
          Meth2add2.x3=Meth2add2.x1+Meth2add2.x2;
          Meth2add.x3=Meth2add.x1+Meth2add.x2;
          x3=x7+Meth2add.x3+Meth2add2.x3;
          return x3;
    }
    public static void main(String args[])
    {
        int w1,w2,w3,w4;
        w1=add();
        w2=Meth2add.add();
        w3=x7();
        w4=x3;
        System.out.println("Addition="+w1);
        System.out.println("Add of class="+w2);
        System.out.println("Add="+w3);
        System.out.println("Add of local="+w4);
    }
}