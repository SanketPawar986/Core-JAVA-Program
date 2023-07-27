class Method1Add
{
    int x=10,y=20,z=0;
    void add()
    {   
        Method1Add a=new Method1Add();
        a.z=a.x+a.y;
        System.out.println("Addition="+a.z);
    }
    public static void main(String args[])
    {
        new Method1Add().add();
    }
}