class r
{
     static int x1=20,y1=40,z1=0;
}
class r1
{
     static int x2=40,y2=60,z2=0;
     static void add()
     {
          int x1=2,y1=8,z1=0;
          int x2=56,y2=78,z2=0;
          r.z1=r.x1+r.y1;
          System.out.println("Add of class r="+r.z1);
          r1.z2=r1.x2+r1.y2;
          System.out.println("Add of instance r1="+r1.z2);
          z1=x1+y1;
          z2=x2+y2;
          System.out.println("Add of local1="+z1);
          System.out.println("Add of local2="+z2);
     }
     public static void main(String args[])
     {
          add();
     }
}