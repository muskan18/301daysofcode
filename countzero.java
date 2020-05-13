###Given an array of size N consisting of only 0's and 1's ,which is sorted in such a manner 
that all the 1's are placed first and then they are followed by all the 0's. You have to find  the count of all the 0's.

================================================================
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
	     int siz = sc.nextInt();
	     int ar[] = new int[siz];
	     for(int i=0;i<siz;i++)
	     {
	         ar[i] = sc.nextInt();
	     }
	     
	     int c = count(ar);
	     System.out.println(c);
	     t--;
	 }
	 }
	 
	 public static int count(int ar[])
	 {
	     int l = ar.length;
	     if(ar[0]==0)
	      return l;
	      
	     else{
	         int c=0;
	         for(int i=0;i<l;i++)
	         {
	             if(ar[i]==0)
	             c++;
	         }
	         return c;
	     }
	     
	     
	     
	 }
}
