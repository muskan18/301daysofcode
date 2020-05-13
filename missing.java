##Find the missing element from  an ordered array A[ ], consisting of N elements representing an Arithmetic Progression (AP) .

===========================================================================================================
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 
	 while(t!=0)
	 {
	     int si = sc.nextInt();
	     
	     int ar[] = new int[si];
	     
	     for(int i=0;i<si;i++)
	     {
	         ar[i] = sc.nextInt();
	     }
	     
	     findmiss(ar);
	     t--;
	 }
	 }
	 
	 public static void findmiss(int ar[])
	 {
	     int n = ar.length;
    int sum=0;
	     for(int i=0;i<n;i++)
         {
            // int s=0;
             sum+=ar[i];
         }
       int total = (n+1)*(ar[0]+ar[n-1])/2; 
	        System.out.println(total-sum);
	 }
}
