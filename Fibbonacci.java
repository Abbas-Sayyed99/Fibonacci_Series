import java.util.*;

class Fibbonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 1, c;
		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();
		System.out.println("\n\t\t\t===========================");

		int i = 1;
		//System.out.print("\n\t\t\t" +a);
		
		while(i<=n)
		{
			System.out.print("\n\t\t\t" +a);

			c = a+b;
			a = b;
			b = c;
		i++;
		}
			

	}
}