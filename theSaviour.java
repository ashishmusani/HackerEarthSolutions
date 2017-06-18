//https://www.hackerearth.com/problem/algorithm/the-savior-3/

import java.util.Scanner;

class theSaviour
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int ANS[]=new int[t];
		
		for(int i=1;i<=t;i++)
		{
		
			int n=in.nextInt();
			int powers[]=new int[n];
			
		
			int ans=0;
			
			for(int j=0;j<n;j++)
			{
				powers[j]=in.nextInt();
			}

			for(int j=0;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((powers[j]+powers[k])%2==0)
					{
						if((powers[j])!=(powers[k]))
						ans++;
					}
				}
			}
			
			ANS[i-1]=ans;
		}
		
		for(int i=0;i<t;i++)
		System.out.println(ANS[i]);
	}
}