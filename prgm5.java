import java.util.*;
class prgm5
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		String str=s.nextLine();
		System.out.println("Enter the marks");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int total=a+b+c;
		System.out.println("total marks is"+total);
		int average=total/3;
		System.out.println("avg is"+average);
		if(total>=350&&)
		{
			System.out.println("third class");
		}
		else if(total>=80)
		{
			System.out.println("second class");
		}
		else if(total>=90)
		{
			System.out.println("first class");
		}
		else
		{
			System.out.println("fail");
		}		

		

		
	}
}