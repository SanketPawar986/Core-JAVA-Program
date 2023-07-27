class Multi
{
    int x=78,y=8,z=0;
    void multi()
    {
        Multi m=new Multi();
        m.z=m.x*m.y;
        System.out.println("Multiplication="+m.z);
    }
    public static void main(String args[])
    {
        new Multi().multi();
    }
}