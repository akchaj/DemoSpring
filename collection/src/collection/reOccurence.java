package collection;

import java.util.Scanner;

public class reOccurence 
{
	public static void main(String[] args) 
	{
		String s; int len,c=0;
		Scanner ob = new Scanner (System.in);
		s=ob.nextLine();
		len = s.length();
		s=s.toLowerCase();
		
		for(int i=0;i<len;i++)
		{ 	c=0;
			for(int j=0;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}	
				}
			if(c==1)
				{System.out.println(s.charAt(i));
				break;}
			
			}
		}
		
		
		
	}


