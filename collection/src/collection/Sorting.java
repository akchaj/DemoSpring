package collection;

import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{	int temp =0;
		Scanner ob = new Scanner (System.in);
		int a[] = new int[5];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<5;i++)
		{
			a[i] = ob.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
