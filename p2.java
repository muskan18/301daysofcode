package day01;

import java.util.Scanner;

public class p2 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int ar[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Before Sorting ! ");
		
		display(ar);
		
		ar = sort(ar);
		
		System.out.println("After Sorting");
		
		display(ar);
		
	}
	
	static void display(int ar[])
	{
		
		for(int k: ar)
		{
			System.out.println(k);
		}
	}
	
	static int [] sort(int ar[])
	{
		
		int n = ar.length;
		
		for(int i=1;i<n;i++)
		{
			
			int key = ar[i];
			
			int j = i-1;
			
			while((j>-1)&&(ar[j]>key)) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = key;
		}
		
		return ar;
	}
	
}
