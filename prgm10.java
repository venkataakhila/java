import java.util.Scanner;
class prgm10
{
	public static void main(String args[])
	{
		int x,fact=1,count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		while(n!=0&&count<=n)
		{
			
			fact=fact*count;
			count++;

		} 
		System.out.println(fact);
	}
}