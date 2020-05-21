import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner sc= new Scanner(System.in);
    
    int t= sc.nextInt();
    
    while(t!=0)
    {
      
      int h = sc.nextInt();
      
      int m = sc.nextInt();
      
      smallangle(h,m);
      
      t--;
    }
  }
  
  static void smallangle(int h,int m)
{
  
  double ha = 0.5*(60*h+m);
  
  double ma = 6*m;
  
  double ang = Math.abs(ha-ma);
  
  int nn = (int)ang;
  System.out.println(Math.min(nn,360-nn));
  
}
  
}
