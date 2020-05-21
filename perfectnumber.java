import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    while(t!=0)
    {
      
      int nnum = sc.nextInt();
      
      checkk(nnum);
      
      t--;
    }
  }
  
  static void checkk(int n)
  {
    
    int sum=0;
    
    for(int i=1;i<n;i++)
    {
      if(n%i==0)
      {
        sum=sum+i;
        
      }
      continue;
    }
    
    if(sum==n)
    System.out.println("true");
  
    else
    System.out.println("false");
    
  }
  
  
}
