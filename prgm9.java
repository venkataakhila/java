import java.util.*;
class prgm9
{
	public static void main(String args[])
	{
		int x,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		while(a!=0)
		{
			
			x=a%10;
			rev=rev*10+x;
			a/=10;
			
		}
		System.out.println(rev);
	}
}