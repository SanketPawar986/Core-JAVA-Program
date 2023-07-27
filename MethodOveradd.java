class MethodOveradd
{
    void add(int x,int y)
    {
        int z=x+y;
        System.out.println("Addition1="+z);
    }
    void add(int x,int y,int z)
    {
        z=x+y;
        System.out.println("Addition2="+z);
    }
    public static void main(String args[])
    {
       MethodOveradd a=new MethodOveradd();
       a.add(10,20);
       a.add(200,400,0);
    }
}