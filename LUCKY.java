import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int sum = sc.nextInt();
    
    findMin(sum);
  }
  
  static void findMin(int sum) 
    { 
        int a = 0, b = 0; 
        while (sum > 0) 
        { 
            // Cases where all remaining digits 
            // are 4 or 7 (Remaining sum of digits 
            // should be multiple of 4 or 7) 
            if (sum % 7 == 0) 
            { 
                b++; 
                sum -= 7; 
            } 
            else if (sum % 4 == 0) 
            { 
                a++; 
                sum -= 4; 
            } 
      
            // If both 4s and 7s are there 
            // in digit sum, we subtract a 4. 
            else
            { 
                a++; 
                sum -= 4; 
            } 
        } 
      
        if (sum < 0) 
        { 
            System.out.print("-1"); 
            return; 
        } 
      
        for (int i = 0; i < a; i++) 
            System.out.print("4"); 
              
        for (int i = 0; i < b; i++) 
            System.out.print("7"); 
              
        System.out.println(); 
    } 
}
