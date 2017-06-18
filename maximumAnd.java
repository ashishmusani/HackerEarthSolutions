//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/maximum-and/

import java.util.*;

class maximumAnd 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
		long ans=0;
		
		while(T>0)
		{
			long a = in.nextLong();
			long b = in.nextLong();
			
			if(b%2 == 0)
				ans = b-2;
			else
				ans = b-1;
			if(ans >= a)
				System.out.println(ans);
			else
			{
				ans = a&b;
				System.out.println(ans);
			}
			T--;
		}
		
    }
}
