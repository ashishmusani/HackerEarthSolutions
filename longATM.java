//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/long-atm-queue-3/

import java.util.*;

class longATM 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

		int arr[] = new int[N];
		
		int groups = 1;
		
		arr[0] = in.nextInt();	
		
        for (int i = 1; i < N; i++) 
        {
            arr[i] = in.nextInt();
			if(arr[i] < arr[i-1])
				groups++;
        }
		
		System.out.println(groups);
    }
}
