class i1
{
    int x,y;
    i1(int x,int y)
    {
        this.x=x;
        this.y=y;
        this.x+=this.y;
        System.out.println("Add="+this.x);
    }
    public static void main(String args[])
    {
         new i1(89,90); 
    }
}