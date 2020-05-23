import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int t= sc.nextInt();
    
    int ar[] = new int[t];
    
    while(t!=0)
    {
      int  a = sc.nextInt();
      int v =  divisi(a);
    System.out.println(v);
    t--;  
    }
    
    
  }
  
  static int divisi(int n)
  {
    
    int rem, value; 
  
    // Find the last digit 
    // or remainder 
    rem = n % 10; 
    switch (rem)  
    { 
  
    // If the last digit is 0 
    case 0: 
        value = 0; 
        break; 
  
    // If the last digit is 5 
    case 5: 
        value = 1; 
        break; 
  
    // If last digit is other  
    // than 0 and 5.  
    default: 
        value = -1; 
    } 
  
    return value; 
    
  }
}
