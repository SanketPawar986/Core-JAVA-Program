class ConstIni
{
    int x;
    ConstIni()
    {
        x=10;
    }
    ConstIni(int x)
    {
        this.x=x;
    }
    public static void main(String args[])
    {
        ConstIni c1=new ConstIni();
        ConstIni c2=new ConstIni(100);
    }
}