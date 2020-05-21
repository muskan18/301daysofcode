import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    while(t!=0)
    {
      
      int n = sc.nextInt();
      
      gens(n);
      
      System.out.println();
      t--;
    }
    
    
  }
  
  static void gens(int n)
  {
    long a = n;
    
    System.out.print(a+" ");
    
    while(a!=1)
    {
      long b= 0;
      
      if(a%2==0)
      {
        b = (long)Math.floor((Math.sqrt(a)));
        
      }
      
      else
      {
        b = (long)Math.floor((Math.sqrt(a)*Math.sqrt(a)*Math.sqrt(a)));
      }
      
      System.out.print(b+" ");
      a=b;
    }
      
  }
  
 
}
