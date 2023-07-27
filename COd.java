class COd
{
    int z1;
    float z2;
    COd(int x,int y)
    {
         z1=x/y;
         System.out.println("Div1="+z1);
    }
    COd(float x,float y)
    {
         z2=x/y;
         System.out.println("Div2="+z2);
    }
    public static void main(String args[])
    {
          new COd(40,20);
          new COd(29.56f,2.5f);
    }
}