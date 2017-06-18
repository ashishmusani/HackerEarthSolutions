//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/monk-and-the-box-of-cookies/

import java.util.*;

class monkAndBox 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) 
        {
			int N = in.nextInt();
			int arr[] = new int[32];
			
			for (int j = 0; j < N; j++) 
			{
				int pos=0;
				int num = in.nextInt();
				while(num>0)
				{
					if((num & 1) == 1)
					{
						arr[pos]++;
					}
					pos++;
					num = num >> 1;
				}
			}

			int maxBit=0;
			
			for (int k = 1; k < 32; k++) 
			{
				if(arr[k]>=arr[maxBit])
				{
					if(arr[k]==arr[maxBit])
					{
						if(k<maxBit)
							maxBit = k;
					}
					
					else
						maxBit = k;
				}
			}
			
			System.out.println(maxBit);
        }
    }
}
