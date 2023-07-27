class Method3add
{
    int x,y,z=0;
    void add(int x1,int y1)
    {
       Method2add a=new Method2add();
       a.x=x1;a.y=y1;
       a.z=a.x+a.y;
       System.out.println("Addition="+a.z);
    }
    public static void main(String args[])
    {
       new Method3add().add(1,2);
    }
}