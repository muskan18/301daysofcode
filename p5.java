package day04;

import java.util.Scanner;

public class p5 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int n = sc.nextInt();
		
		int ar[] = new int [n];
		
		System.out.println("Enter elemets");
		
		for(int i=0;i<n;i++)
		{
			
			ar[i] = sc.nextInt();
		}
	
		sc.close();
		
		sort(ar,0,ar.length-1);
		print(ar);
		}
	
	

	static int partition(int[] arr,int low,int high)
	 {
		 int pivot=arr[high];
		 int i=(low-1);
		 for(int j=low;j<high;j++)
		 {
			 if(arr[j]<pivot)
			 {
				 i=i+1;
				 int tem=arr[i];
				 arr[i]=arr[j];
				 arr[j]=tem;
			 }
		 }
		 int temp=arr[i+1];
		 arr[i+1]=arr[high];
		 arr[high]=temp;
		 return i+1;
	 }

	 static void sort(int[] arr,int low,int high)
	 {
		 if(low<high)
		 {
			 int pi=partition(arr,low,high);
			 sort(arr,low,pi-1);
			 sort(arr,pi+1,high);
		 }
	 }
	
	static void print(int[] arr)
	 {
		 int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	 }


}
