// selection  sort

package day03;

import java.util.Scanner;

public class p4 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter array size");
		
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Sorted Array");
		
		ar = selectionsort(ar);
		
		display(ar);
		
		sc.close();
		
	}
	
	
	static int[] selectionsort(int ar[])
	{
		
		for(int i=0;i<ar.length-1;i++)
		{
			int index = i;
			
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[index]>ar[j])
				{
					index =j;
				}
			}
			
			int tmp = ar[i];
			ar[i] = ar[index];
			ar[index] = tmp;
			}
		
		return ar;
	}
	
	
	static void display(int arr[])
	{
		for(int j:arr)
		{
			System.out.println(j);
		}
	}
	
	
}
