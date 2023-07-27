class M4A
{
     static int x1,x2,x3=0;
     static int add(int x,int y)
     {
          M4A.x1=x;M4A.x2=y;
          M4A.x3=M4A.x1+M4A.x2;
          return M4A.x3;
     }
}
class M4A2
{
    static int x1,x2,x3=0;
    static int add(int x,int y)
    {    int w5;
       M4A2.x1=x;M4A2.x2=y;
       int x1=1000,x2=2000,x3=0;
       x3=x1+x2;
       M4A2.x3=M4A2.x1+M4A2.x2;
       System.out.println("ADD1="+M4A2.x3);
       M4A.x3=M4A.x1+M4A.x2;
       System.out.println("ADD2="+M4A.x3);
       w5=x3+M4A2.x3+M4A.x3;
      System.out.println(w5);
       return w5;
    }
    public static void main(String args[])
    {
       int w1,w2;
       w2=M4A.add(40,50);
       w1=add(20,30);
       System.out.println("Addition="+w1);
       System.out.println("Add of class="+w2);
    }
}