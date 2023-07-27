class Student
{
    int Rollno;
    int Age;
    float Marks;
    String Name;
    Student()
    {
         Rollno=101;
         Age=13;
         Marks=30.4f;
         Name="Ayush";
         System.out.println("*First Student Information");
         System.out.println("  Rollno="+Rollno);
         System.out.println("  Age="+Age);
         System.out.println("  Marks="+Marks);
         System.out.println("  Name="+Name);
    }
    Student(int Rollno,int Age,float Marks,String Name)
    {
         this();
         this.Rollno=Rollno;
         this.Age=Age;
         this.Marks=Marks;
         this.Name=Name;
         System.out.println("*Second Student Information");
         System.out.println("  Rollno="+this.Rollno);
         System.out.println("  Age="+this.Age);
         System.out.println("  Marks="+this.Marks);
         System.out.println("  Name="+this.Name);
    }
    public static void main(String args[])
    {
         new Student(102,13,78.4f,"Rohan");
    }
}