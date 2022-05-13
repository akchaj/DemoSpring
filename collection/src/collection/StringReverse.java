package collection;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) {
		
		String s; int len; String rev = "";
		Scanner ob = new Scanner (System.in);
		s= ob.nextLine();
		System.out.println(s);
		len = s.length();
		
		
		for(int i=len-1;i>=0;i--)
		{
			char c = s.charAt(i);
			rev =rev +c;
		}
		System.out.println("Reversed " +rev);
		
	}

}
