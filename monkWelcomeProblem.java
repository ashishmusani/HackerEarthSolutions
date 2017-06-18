//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/

import java.util.*;

class monkWelcomeProblem 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
		
		in.nextLine();

		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		String ip1[] = str1.split(" ");
		String ip2[] = str2.split(" ");
		
		long arr1[] = new long[N];
		
		for(int k=0; k<N; k++)
		{
			arr1[k] = Long.parseLong(ip1[k]);
			arr1[k] += Long.parseLong(ip2[k]);
		}
		
		for(int k=0; k<N; k++)
		{
			System.out.print(arr1[k]+" ");
		}
		
		System.out.println();
    }
}
