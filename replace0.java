
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}

class GfG {
    int convertfive(int num) {
        // Your code here
        int x = num;
        if(x==0)
        return 5;                          
  
  if(x%10==x)
  return x;                       
  
  return (10*convertfive(x/10)+(x%10==0 ? 5 : x%10));
    }
}
