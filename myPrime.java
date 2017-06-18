//https://www.hackerearth.com/problem/algorithm/my-prime/

import java.util.Scanner;

class myPrime
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int S[] = new int[n];
		
		for(int i=0;i<n;i++)
			S[i]=in.nextInt();
		
		for(int j=0;j<n;j++)
		{
			int flag = 1;
			for(int k=0;(k<n);k++)
			{
				if(k==j);
				else
				{
					if(S[j]%S[k] == 0)
					{
						flag=0;
						break;
					}
				}

			}
			if(flag == 1)
				System.out.print(S[j]+" ");
		}
	}
}