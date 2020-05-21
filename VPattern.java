import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    char ch = sc.next().charAt(0);
    
    if(ch=='V')
    {
      functio();
    }
    else
    functio();
  }
  
  public static void functio() {
    
    int n=5;
    for(int i=0;i<=n;i++)
    {
      get(1,i,n);
      System.out.println();
        }
    
  }
  
  static void get(int num,int i,int n)
  {
   if(num==n+1)
   return;
   
   if(num<=i)
   {
     System.out.print(num);
     get(num+1,i,n);
     System.out.print(num);
   }
   if(num>i)
   {
     System.out.print(" ");
     get(num+1,i,n);
     System.out.print(" ");
   }
    
  }
  
  
}
