public class StudentResult
{
   public static void main(String argc[])
     {
	int marks=80;
	if(marks>40)
	{
	if(marks>=66)
	  System.out.println("Distinction");
	else if(marks>=60 && marks<66)
	  System.out.println("First Class");
	else if(marks>=40 && marks<60)
          System.out.println("Second Class");
	else
	   System.out.println("Fail");
	}
     }
}

	 