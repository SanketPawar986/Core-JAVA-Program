class M3A
{
    static int x1,x2,x3=0;
    static void add(int x,int y)
    {
         M3A.x1=x;M3A.x2=y;
         M3A.x3=M3A.x1+M3A.x2;
         System.out.println("Add of class="+M3A.x3);
    }
}
class M3A2
{
    static int x1,x2,x3=0;
    static void add(int x,int y)
    {    int w;
         M3A2.x1=x;
         M3A2.x2=y;
         int x1=4000,x2=5000,x3=0;
         x3=x1+x2;
         System.out.println("Addition of Local Variable="+x3);
         M3A2.x3=M3A2.x1+M3A2.x2;
         System.out.println("Addition of Instance Variable="+M3A2.x3);
         w=x3-M3A.x3+M3A2.x3;
         System.out.println("Addition of whole class="+w);
    }
    public static void main(String args[])
    {
         M3A.add(80,90);
         add(50,50);
    }
}