import java.util.*;
class prgm4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("Largest number"+a);
			if(b>c)
			{
				System.out.println("Second largest number"+b);
			}
			else
			{
				System.out.println("second largest number"+c);
			}
		}
		else if(b>a&&b>c)
		{
			System.out.println("Largest number"+b);
			
			if(a>c)
			{
				System.out.println("second largest number"+a);
			}
			else
			{
				System.out.println("Second largest number"+c);
			}
		}
		else if(c>a&&c>b)
		{
			System.out.println("Largest number"+c);
			if(a>b)
			{
				System.out.println("second largest number"+a);
			}
			else
			{
				System.out.println("second largest number"+b);
			}
		}
		else
		{
			System.out.println("plss enter positive number");
		}
		
		
		
		
	}
}