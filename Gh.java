java.util.*;
class Gh
{
   public static void main(String args[])
   {      
       for(int i=0;i<3;i++)
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any number=");
          int number=sc.nextInt();
           
          if(number%2==0)
          {
              even();
          }
          else
           {
              odd();
           }
        }
   }
  void even(int no)
   {
       System.out.println("y="+no);
   }
   void odd(int no)
   {
       System.out.println("z="+no);
   }
}