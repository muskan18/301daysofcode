package day05;

import java.util.Scanner;

public class p6 {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of array ");
		
		int n = sc.nextInt();
		
		System.out.println("Array elements ");
		
		int ar[] = new int[n];
		
		for(int i=0;i<n;i++)

		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Element you want to search ! ");
		
		int ele = sc.nextInt();
		
		sc.close();
		
		findelement(ar,ele);
	}
	
	
	static void findelement(int ar[] , int ele)
	{
		
	int flag =0;
	int in =0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i] == ele)
		{
			flag =1;
			in =i;
			break;
		}
		
	}
	
	if(flag==1)
	{
		System.out.println("The element was found at index : "+ in);
				
	}
	else
	{
		System.out.println("The element was not found ! ");
	}
	
	
		
	}
}
