import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
  while(t!=0)
  {
      int a = sc.nextInt();
    
    socktime(a);

    t--;
    
  }
  } 
      
  
  static void socktime(int a)
  {
    
  System.out.println(a+1);
    }
}
