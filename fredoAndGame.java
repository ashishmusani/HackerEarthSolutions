//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/fredo-and-game/

import java.util.*;

class fredoAndGame 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) 
        {
			int A = in.nextInt();
			int N = in.nextInt();
			
			int arr[] = new int [N];
			
			for(int k=0; k<N; k++)
				arr[k] = in.nextInt();
			
			int k=0;
			int flag = 0;
			
			while(A>0)
			{
				if(k==N)
				{
					System.out.println("Yes " + A);
					flag = 1;
					break;
				}
				
				if(arr[k] == 0)
					A--;
				else
					A += 2;
				
				k++;
			}
			if((flag == 0) && (k != N))
				System.out.println("No " + k);
			else
				System.out.println("Yes " + A);

        }
    }
}
