package justprac;

import java.util.*;

public class specialnumber {

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number ");
			
			int num = sc.nextInt();
			
			int x,y;
			
			int flag=0;
			
			int sqr = (int)Math.sqrt(num);
			
			for(x=2;x<=sqr;x++)
			{
				for(y=2;y<=x;y++) {
				
				int numnew = (int)Math.pow(x,y );
				
				if(numnew==num) {
				
					flag=1;
				//	System.out.println("Its a special number");
				
					break;
			}
			
			}
				}
			
			if(flag==1)
				System.out.println("Special number");
			
			else
				System.out.println("Not a special number");
			
			
			sc.close();
		}
		
	}


