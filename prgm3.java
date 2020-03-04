import java.util.Scanner;
class prgm3
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextLine();
		String str=(n%2==0 ? "even":"odd");
		System.out.println(str);
			
		
		
	}
}
