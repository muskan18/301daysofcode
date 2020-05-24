import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    while(t!=0)
    {
      
      int l = sc.nextInt();
      int r = sc.nextInt();
      
      int ll=findgrt(l,r);
      System.out.println(ll);
      t--;
    }
  }
  
  static int findgrt(int l,int r)
  {
    
    if (l == r) { 
            return l; 
        } 
  
        return 1; 
    }
}
