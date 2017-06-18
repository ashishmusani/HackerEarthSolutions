//https://www.hackerearth.com/problem/algorithm/sherlock-and-xor/

import java.util.Scanner;

class sherlockXOR
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();

		for(int i=0;i<t;i++)
		{
			int n = in.nextInt();
			int A[] = new int[n];
			int total=0;
		
			for(int j=0;j<n;j++)
				A[j]=((in.nextInt())%10);
			
			for(int j=0;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((((A[j])^(A[k]))%2)!=0)
					{
						total++;
					}
				}
			}
			
			System.out.println(total);
		
		}
		
	}
}