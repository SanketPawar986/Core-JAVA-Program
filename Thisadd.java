class Thisadd
{
    int x1=100,y1=200,z1=0;
    void add()
    {
        int x1=1000,y1=2000,z1=0;
        z1=x1+y1;
        System.out.println("Addition of Local Variable="+z1);
        this.z1=this.x1+this.y1;
        System.out.println("Addition of Instance Variable="+this.z1);  
    }
    void m1()
    {
        add();
    }
    public static void main(String args[])
    {
        new Thisadd().m1();
    }
}