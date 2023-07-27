class ADdfloat
{
     double x=89.67,y=34.67,z=0;
     void add()
     {
          ADdfloat a=new ADdfloat();
          a.z=a.x+a.y;
          System.out.println("Addition="+a.z);
     }
     public static void main(String args[])
     {
          new ADdfloat().add();
     }
}