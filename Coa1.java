class Coa1
{
    Coa1(int x,float y)
    {
        float z=x+y;
        System.out.println("Add1="+z);
    }
    Coa1(float x,int y)
    {
        float z=x+y;
        System.out.println("Add2="+z);
    }
    public static void main(String args[])
    {
        new Coa1(879,20.0f);
        new Coa1(78.6f,60);
    }
}