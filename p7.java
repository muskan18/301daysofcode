package day06;
import java.util.*;

public class p7 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		
		System.out.println("Enter numbers");
		
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to be searched ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		int result = binarySearch(ar,0,n-1,num);
		
		if(result ==-1)
			System.out.println("Not found");
		
		else
			System.out.println("Element found");
	}
	
	static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid; 
  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}
