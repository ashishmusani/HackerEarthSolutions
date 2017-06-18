//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/chandu-and-his-girlfriend/

import java.util.*;
import java.io.*;

class chanduAndGF
{
    public static void main(String args[] ) throws Exception 
    {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
        int T = Integer.parseInt(in.readLine());

        for (int k = 0; k < T; k++) 
        {
			int N = Integer.parseInt(in.readLine());
		
			String str[] = in.readLine().split(" ");
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++)
				arr[i] = Integer.parseInt(str[i]);
			
			Arrays.sort(arr);
			
			for(int i=N-1; i>=0; i--)
				System.out.print(arr[i]+" ");

			System.out.println();
        }
    }
}
