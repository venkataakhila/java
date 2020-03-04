import java.util.Scanner;
class prgm13
{
	public static void main(String args[])
	{
		int i,c=0,sum=0,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter a values");
			a[i]=s.nextInt();
			System.out.println(a[i]);
		}
		System.out.println("enter a key");
		int k=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
				System.out.println("found at"+i);
				c=1;
				break;
		
			}
		}
		if(c==0)
		{
			System.out.println("not found");
		
		}
	}
}