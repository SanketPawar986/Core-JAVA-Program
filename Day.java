class Day
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
   }
   public static void main(String args[])
   { 
       m1(3);
       m1(4);
       m1(5);
       m1(1);
       m1(2);
   }
}