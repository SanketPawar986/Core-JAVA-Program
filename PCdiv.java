class PCdiv
{
    int x,y,z;
    PCdiv(int x,int y)
    {
        this.x=x;
        this.y=y;
        z=x/y;
        System.out.println("Division="+z);
    }
    public static void main(String args[])
    {
        new PCdiv(5646,234);
    }
}