class Z4
{
    double add()
    {
        double x=932.45,y=241.31,z=0;
        z=x+y;
        return z;
    }
}
class Z5 extends Z4
{
    double add()
    {
        double x=291.260,y=478.39,z=0;
        z=x+y;
        return z;
    }
    public static void main(String args[])
    {
        double w;
        w=new Z5().add();
        System.out.println("Add="+w);
    }
}