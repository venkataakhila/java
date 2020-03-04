import java.util.Scanner;
class prgm2
{
	public static void main(String args[])
	{
		int a,b,c,d,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=(a>b?a:b);
		result=(c>d?c:d);
		System.out.println("the largest number is"+result);
		
			
	}
}