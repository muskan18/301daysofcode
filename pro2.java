import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    while(t!=0)
    {
      int num = sc.nextInt();
      
      checkleap(num);
    
      t--;
      
    }
    
  }
  
  public static void checkleap(int num)
  {
    
   if(num%400==0)
   System.out.println("Yes");
   
   else if((num%4==0)&&(num%100!=0))
   System.out.println("Yes");
   
    else
    System.out.println("No");
  }
}
