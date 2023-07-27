class Student2
{
     int Rollno;
     int Age;
     float Marks;
     String Name;
     Student2()
     {  
         this(102,13,78.4f,"Rohan");
         Rollno=101;
         Age=13;
         Marks=56.89f;
         Name="Sushant";
         System.out.println("*First Student Data");
         System.out.println("  Rollno="+Rollno);
         System.out.println("  Age="+Age);
         System.out.println("  Marks="+Marks);
         System.out.println("  Name="+Name);
     }
     Student2(int Rollno,int Age,float Marks,String Name)
     {
         this.Rollno=Rollno;
         this.Age=Age;
         this.Marks=Marks;
         this.Name=Name;
         System.out.println("*Second Student Data");
         System.out.println("  Rollno="+this.Rollno);
         System.out.println("  Age="+this.Age);
         System.out.println("  Marks="+this.Marks);
         System.out.println("  Name="+this.Name);
     }
     public static void main(String args[])
     {
         new Student2();
     }
}