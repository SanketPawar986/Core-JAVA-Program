class Films
{
     static int Marfilm;
     static int Hindifilm;
     static void m1(int Marfilm1)
     {
         Marfilm=Marfilm1;
         if(Marfilm==1)
         {
               System.out.println("> Marathi-FARJAND");
         }
         else if(Marfilm==2)
         {
               System.out.println("> Marathi-SHEER_SHIVRAY");
         }
         else if(Marfilm==3)
         {
               System.out.println("> Marathi-SAR_SENAPATI_HAMBIRAO");
         }
         else if(Marfilm==4)
        {
              System.out.println("> Marathi-DYA_DHAKKA");
        }
        else if(Marfilm==5)
        {
             System.out.println("> Marathi-GADVACHA_LAGNA");
        }
        else if(Marfilm==6)
        {
             System.out.println("> Marathi-TIMEPASS");
        }
        else
        {
             System.out.println("Invlaid Marfilm allow is from 1 to 6");
        }
     }
     static void m2(int Hindifilm1)
     {
         Hindifilm=Hindifilm1;
         if(Hindifilm==7)
         {
             System.out.println("> Hindi-BAJIRAO_MASTANI");
         }
         else if(Hindifilm==8)
         {
              System.out.println("> Hindi-3_IDITOS");
         }
         else if(Hindifilm==9)
         {
               System.out.println("> Hindi-SHAMSHERA");
         }
         else if(Hindifilm==10)
         {
               System.out.println("> Hindi-GOLMAAL");
         }
         else if(Hindifilm==11)
         {
               System.out.println("> Hindi-KRISHNA_COTTAGE");
         }
         else if(Hindifilm==12)
         {
               System.out.println("> Hindi-EK_VILLAN_RETURNS");
         }
         else
         {
               System.out.println("Invlaid Hindifilm allow is from 7 to 12");
         }
     }
     public static void main(String args[])
     {
         m1(2);
         m2(9);
         m1(11);
         m2(3);
         m2(7);
         m1(5);
     }
}