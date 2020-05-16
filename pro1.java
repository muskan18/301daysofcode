import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
   
   Scanner sc = new Scanner(System.in);
   
   int n=sc.nextInt();
   
   int tmp = n;
   int num=0;
   
   while(tmp!=0)
   {
     int rem = tmp%10;
     
     num = num*10+rem;
     tmp=tmp/10;
     
     
   }
   System.out.println(num);
   
  }
}
