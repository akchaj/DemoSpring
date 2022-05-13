package collection;

import java.util.Scanner;

public class NearestPalindome 
{
	public static void main(String[] args) 
	{
		int n,a=0,b=0;
		NearestPalindome obj = new NearestPalindome();
		
		Scanner ob = new Scanner (System.in);
		n= ob.nextInt();
		a=n+1;
		b=n-1;
		while(!obj.palindrome(a))
		{
			a++;
		
		}
		while(!obj.palindrome(b))
		{
			b--;
		
		}
		
		if((a-n)<(n-b))
		{
			System.out.println(a);
		}
		else if((a-n)==(n-b))
		{
			System.out.println(a);
			System.out.println(b);
		}
		else
		{
			System.out.println(b);
		}
	}
	
	public boolean palindrome(int a)
	{
		int b=0,rev=0, n=a ;
		while(a>0)
		{
			b=a%10;
			rev = rev*10+b;
			a=a/10;
		
		}
		if(rev == n)
		{
			return true;
		}
		else 
			return false;
	}
}

