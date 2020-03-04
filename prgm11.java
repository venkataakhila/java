import java.util.Scanner;
class prgm11
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i*(-1));
			}
			else
			{
				System.out.println(i);
			}
		}
		
	}
}