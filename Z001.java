class Z001
{
    int x,y,z;
    public void div(int x,int y)
    {
      try
      {
         this.x=x;
         this.y=y;
         this.z=this.x/this.y;
         System.out.println("Division="+this.z);
      }
      catch(RuntimeException ae)
      {
         System.out.println(ae);
      }
    }
    public static void main(String args[])
    {
       try
       {
           int x=Integer.parseInt(args[0]);
           int y=Integer.parseInt(args[1]);
           Z001 z=new Z001();
           z.div(x,y);
       }
       catch(RuntimeException re)
       {
           System.out.println(re);
       }
    }
}