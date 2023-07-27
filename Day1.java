class Day1
{
   static int day_of_week;
   static void m1(int day_of_week1)
   {
         day_of_week=day_of_week1;
         if(day_of_week==1)
         {
               System.out.println("your choice is Monday");
         }
         else if(day_of_week==2)
         { 
                System.out.println("your choice is Tuesday");
         }
         else if(day_of_week==3)
         {
               System.out.println("your choice is Wednesday");
         }
         else if(day_of_week==4)
         { 
               System.out.println("your choice is Thursday");
         }
         else if(day_of_week==5)
         {
               System.out.println("your choice is Friday");
         }
         else if(day_of_week==6)
         { 
               System.out.println("your choice is Saturday");
         }
         else if(day_of_week==7)
         {
               System.out.println("your choice is Sunday");
         }
   }
   public static void main(String args[])
   { 
       int i;
       for(i=1;i<=10;i++)
       { 
            m1(i);
       }
   }
}