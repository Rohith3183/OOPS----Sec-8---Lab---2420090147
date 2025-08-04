package lab1;
import java.util.*;
public class GCD
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		System.out.println("Enter the number : ");
		int b = sc.nextInt();
		int max=0;
		int i;
		int limit = Math.min(a, b);
		for(i=1; i<limit; i++)
		{
			if (a%i == 0 && b%i == 0 && i>max) 
			{
				max=i;
			}
		}
		System.out.println(max);
	}
}