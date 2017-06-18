//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/

import java.util.*;

class minMax 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
		int arr[] = new int[101];

        int N = in.nextInt();


		int min=101;
		int max=0;
		
        for (int i = 0; i < N; i++)
		{
			int temp = in.nextInt();
			arr[temp] = 1;
			
			if(temp<min)
				min = temp;
			if(temp>max)
				max = temp;
			
		}
		
        for (int i = min; i <= max; i++)
		{
			if(arr[i] == 0)
			{
				System.out.println("NO");
				System.exit(0);
			}
		}
		
		System.out.println("YES");
		
    }
}
