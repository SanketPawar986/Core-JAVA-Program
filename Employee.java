class Employee
{
    int Emp_Id;
    int Age;
    float Emp_Salary;
    String Emp_Name;
    Employee()
    {
         Emp_Id=111;
         Age=34;
         Emp_Salary=8949.89f;
         Emp_Name="Ayush Narke";
         System.out.println("*First Employee Information");
         System.out.println("  Emp_Id="+Emp_Id);
         System.out.println("  Age="+Age);
         System.out.println("  Emp_Salary="+Emp_Salary);
         System.out.println("  Emp_Name="+Emp_Name);
    }
    Employee(int Emp_Id,int Age,float Emp_Salary,String Emp_Name)
    {
         this();
         this.Emp_Id=Emp_Id;
         this.Age=Age;
         this.Emp_Salary=Emp_Salary;
         this.Emp_Name=Emp_Name;
         System.out.println("*Second Employee Information");
         System.out.println("  Emp_Id="+this.Emp_Id);
         System.out.println("  Age="+this.Age);
         System.out.println("  Emp_Salary="+this.Emp_Salary);
         System.out.println("  Emp_Name="+this.Emp_Name);
    }
    public static void main(String args[])
    {
         new Employee(112,33,78453.43f,"Sanket Pawar");
    }
}