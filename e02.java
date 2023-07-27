class e02
{
     e02()
     {
         System.out.println("Default Constructor");
     }
     e02(String s1)
     {
         this();
         System.out.println("s1="+s1);
     }
     e02(String s1,String s2)
     {
         this(s1);
         System.out.println("s1="+s1 +",s2="+s2);
     }
     e02(String s1,String s2,String s3)
     {
         this(s1,s2);
         System.out.println("s1="+s1 +",s2="+s2 +",s3="+s3);
     }
     e02(String s1,String s2,String s3,String s4)
     {
         this(s1,s2,s3);
         System.out.println("s1="+s1 +",s2="+s2 +",s3="+s3 +",s4="+s4);
     }
    public static void main(String args[])
    {
         new e02("J2SE","J2EE","J2ME","J2FX");
    }
}