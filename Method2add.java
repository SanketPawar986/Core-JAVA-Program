class Method2add
{
    int x=10,y=20,z=0;
    int add()
    {
       Method2add a=new Method2add();
       a.z=a.x+a.y;
       return a.z;
    }
    public static void main(String args[])
    {
       int w;
       w=new Method2add().add();
       System.out.println("Addition="+w);
    }
}