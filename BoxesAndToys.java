import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int count=0;
    while(n!=0)
    {
      int toy = sc.nextInt();
      
      int capa = sc.nextInt();
      
      int cc = capa-toy;
      
      
      if(cc>=2)
      {
        count++;
        
      }
      
      cc=0;
      
      n--;
    }
    
    System.out.print(count);
    
    
  }
  
  
}
