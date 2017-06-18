//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/monk-and-his-friend/

import java.util.*;

class monkAndFriend 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) 
        {
			long M = in.nextLong();
			long P = in.nextLong();
			
			long ans = M^P;
						
			int count = 0;
			while(ans>0)
			{
				if((ans&1) == 1)
					count++;
				ans = ans >> 1;
			}
			System.out.println(count);
        }
    }
}
