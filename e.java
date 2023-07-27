class e
{
     e()
     {
         System.out.println("Default Constructor");
     }
     e(String s1)
     {
         new e();
         System.out.println("s1="+s1);
     }
     e(String s1,String s2)
     {
         new e(s1);
         System.out.println("s1="+s1 +",s2="+s2);
     }
     e(String s1,String s2,String s3)
     {
         new e(s1,s2);
         System.out.println("s1="+s1 +",s2="+s2 +",s3="+s3);
     }
     e(String s1,String s2,String s3,String s4)
     {
         new e(s1,s2,s3);
         System.out.println("s1="+s1 +",s2="+s2 +",s3="+s3 +",s4="+s4);
     }
    public static void main(String args[])
    {
         new e("J2SE","J2EE","J2ME","J2FX");
    }
}