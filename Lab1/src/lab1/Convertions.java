package lab1;
import java.util.*;
public class Convertions
{
	public static void main(String args [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the temperture: ");
		float temp= sc.nextFloat();
		int f=32;
		double ferh=(temp*9/5)+f;
		System.out.println("tempcon : " +ferh);
	}

}