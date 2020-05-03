package day10;

import java.util.*;
public class p9 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size");
		
		int n = sc.nextInt();
		
		System.out.println("Enter array elements");
		
		int ar[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Enter element to search");
		
		int ele = sc.nextInt();
		
		int r = binarySearch(ar,ele);
		
		System.out.println(r);
		
		sc.close();
		
		
	}
	
	static int binarySearch(int[] inputArr, int key) {
        
        int start = 0;
     
        int end = inputArr.length - 1;
        
        while (start <= end) {
        
        	int mid = (start + end) / 2;
            
        	if (key == inputArr[mid]) {
                return mid;
            }
        	
            if (key < inputArr[mid]) {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
