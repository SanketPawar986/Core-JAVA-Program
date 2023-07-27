class Beauty_dept_courses
{
     static int beauty_dept_courses;
     static void m1(int beauty_dept_courses1)

     {
        beauty_dept_courses=beauty_dept_courses1;
	if(beauty_dept_courses==1)

	{
						
             System.out.println("your choice is certificate course in advance parlour");

	}
	
        else if(beauty_dept_courses==2)
	
        {
		
             System.out.println("your choice is certificate course in basic beauty parlour");

	}
	
        else if(beauty_dept_courses==3)
	
        {
		
             System.out.println("your choice is certificate course in advance make-up artist");
	
        }
	
        else if(beauty_dept_courses==4)
	
        {
		
             System.out.println("your choice is certificate course in basic make-up artist");

	}
	
        else
	
        {
		
             System.out.println("invalid choice beauty_dept_courses from 1 to 4");

	}

     }
     public static void main(String args[])
    {
         int i;
         for(i=1;i<=5;i++)
         {
               m1(i);
         }
    }
}