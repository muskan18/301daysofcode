package day01;

import java.util.*;

public class p1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array ! ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements ! ");
		
		int ar[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
			
		}
		
		System.out.println("Before Sorting ");
		
		display(ar);
		
		ar=sort(ar);
		
		System.out.println("After Sorting");
		
		display(ar);
		
		sc.close();
		
	}
	
	static void display(int ar[])
	{
		
		for(int k:ar )
		{
			System.out.println(k);
		}
	}
	
	static int [] sort(int ar[]) {
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j]=temp;
					
				}
			}
		}
		
		
		return ar;
	}
	
}
