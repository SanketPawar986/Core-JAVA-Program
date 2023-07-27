class Subsup
{
    int x=89,y=34,z=0;
}
class B extends Subsup
{
    int x=78,y=20,z=0;
    void sub()
    {
        int x=20,y=56,z=0;
        z=x-y;
        this.z=this.x-this.y;
        super.z=super.x-super.y;
        System.out.println("Local Variable="+z);
        System.out.println("Instance Variable="+this.z); 
        System.out.println("Instance Variable of Super Class="+super.z);
    }
    void m1()
    {
        sub();
        this.sub();
    }
    public static void main(String args[])
    {
        new B().m1();
    }
}