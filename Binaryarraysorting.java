/* Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

*/

//======================Code==========================


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 




class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	     int arrb[] = new int[arr.length];
	    int zeroInsertIndex = 0;
    int oneInsertIndex =arrb.length-1;

    for(int i=0; i<arr.length; i++){
        if(arr[i] == 1) 
            arrb[oneInsertIndex--] = 1;
        else if (arr[i] == 0) 
            arrb[zeroInsertIndex++] = 0;
    }
     return arrb;   
	} 
} 
