package lab1;
import java.util.*;
public class alphabet_check 
{
	public static void main(String args []) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
	
		if(ch>='a' && ch<='z' || ch>='A' && ch<='z') 
		{
			System.out.println("The character is alphabet");				
		}
		else 
		{
			System.out.println("The character is not an anphabet");
				
		} 
		
	}
	
}