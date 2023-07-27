class PCadd
{
    int x,y,z;
    PCadd(int x,int y)
    {
        this.x=x;
        this.y=y;
        z=x+y;
        System.out.println("Addition="+z);
    }
    public static void main(String args[])  
    {
        new PCadd(10,20);
    }
}