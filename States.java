class States
{
   static int State;
   static void m1(int State1)
   {
        State=State1;
        if(State==1)
        {
           System.out.println("your choice is Maharashtra");
        }
        else if(State==2)
        {
           System.out.println("Your choice is Delhi");  
        }
        else if(State==3)
        {
           System.out.println("your choice is Arunachal Pradesh");
        }
        else if(State==4)
        {
           System.out.println("your choice is Assam");
        }
        else if(State==5)
        {
           System.out.println("your choice is Bihar");
        }
        else if(State==6)
        {
           System.out.println("your choice is Goa");
        }
        else if(State==7)
        {
           System.out.println("your choice is Gujarat");
        }
        else if(State==8)
        {
           System.out.println("your choice is Jharkhand");
        }
        else if(State==9)
        {
           System.out.println("your choice is Himachal Pradesh");
        }
        else if(State==10)
        {
           System.out.println("your choice is Haryana");
        }
        else if(State==11)
        {
           System.out.println("yoyr choice is Kerala");
        }
        else if(State==12)
        {
           System.out.println("your choice is Rajasthan");
        }
        else if(State==13)
        {
           System.out.println("your choice is West Bengal");
        }
        else if(State==14)
        {
           System.out.println("your choice is Uttar Pradesh");
        }
        else if(State==15)
        {
           System.out.println("your choice is Tripura");
        }
        else if(State==16)
        {
           System.out.println("your choice is Telangana");
        }
        else if(State==17)
        {
           System.out.println("your choice is Uttrakhand");
        }
        else if(State==18)
        {
           System.out.println("your choice is Karnataka");
        }
        else if(State==19)
        {
           System.out.println("your choice is Manipur");
        }
        else if(State==20)
        {
           System.out.println("your choice is Odisha");
        }
        else if(State==21)
        {
           System.out.println("your choice is Punjab");
        }
        else if(State==22)
        {
           System.out.println("your choice is Sikkim");
        }
        else if(State==23)
        {
           System.out.println("your choice is Tamil Nadu");
        }
        else if(State==24)
        {
           System.out.println("your choice is Mizorim");
        }
        else if(State==25)
        {
           System.out.println("your choice is Madhya Pradesh");
        }
        else if(State==26)
        {
           System.out.println("your choice is Nagaland");
        }
        else if(State==27)
        {
           System.out.println("your choice is Meghalay");
        }
        else if(State==28)
        {
           System.out.println("your choice is Haryana");
        }
        else
        {
           System.out.println("Invalid State allow is from 1 to 28");
        }
   }
   public static void main(String args[])
   {
        int i;
        for(i=1;i<=28;i++)
        {
            m1(i);
        }
   }
}