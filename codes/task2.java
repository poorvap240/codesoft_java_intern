import java.util.*;
class task2
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter your marks in English:");
	int a = sc.nextInt ();
	  System.out.println ("Enter your marks in Maths:");
	int b = sc.nextInt ();
	  System.out.println ("Enter your marks in Science:");
	int c = sc.nextInt ();
	  System.out.println ("Enter your marks in Hindi:");
	int d = sc.nextInt ();
    
	double sum = a + b + c + d;
	double percentage = (sum / 4);
	System.out.println ("total marks=" +sum);
	
	System.out.println ("percentage=" + percentage);
	
	if (percentage >= 90)
	  {
		System.out.println ("grade is A+");
	  }
	else if (percentage < 90 && percentage >= 80)
	  {
		System.out.println ("grade is A");
	  }
	else if (percentage < 80 && percentage >= 70)
	  {
		System.out.println ("grade is B ");

	  }
	else if (percentage < 70 && percentage >= 60)
	  {
         System.out.println("grade is C");
	  }
	  else if (percentage < 60 && percentage >= 50)
	  {
         System.out.println("grade is D");
	  }
      else if (percentage < 50)
	  {
         System.out.println("grade is E");
         sc.close();
	  }
	  
  }
}
