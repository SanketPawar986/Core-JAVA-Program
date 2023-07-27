class i
{
    int x=10,y=20;
    i()
    {
        this.x+=this.y;
        System.out.println("Addition="+this.x);
    }
    public static void main(String args[])   
    {
        new i();
    }
}