//https://www.hackerearth.com/problem/algorithm/roy-and-wobbly-numbers/

import java.util.Scanner;
import java.util.Arrays;
class wobblyNumbers
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		
		String ans[] = new String[t];
		Arrays.fill(ans,"");

		String weeblyNo[] = new String[100];
		Arrays.fill(weeblyNo,"");


		int q=0;		
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			{
				if(i==j);
				else
				{
					weeblyNo[q]+= String.valueOf(i);
					weeblyNo[q]+= String.valueOf(j);
					q++;								//last value of 81 and blank
				}
			}
		}
		

		for(int l=0;l<t;l++)
		{
		
			int n=in.nextInt();
			int k=in.nextInt();
			
			if(k>81)
				ans[l]="-1";
			else
			{
				for(int p=1;p<=(n/2);p++)
					ans[l] += weeblyNo[k-1];
				if((n%2)!=0)
					ans[l] += String.valueOf((k/9)+1);
			}
			
		}
		
		for(int l=0;l<t;l++)
		{
			System.out.println(ans[l]);
		}
	}
}