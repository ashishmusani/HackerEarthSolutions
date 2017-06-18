//https://www.hackerearth.com/problem/algorithm/valentine-shopping-4/

import java.util.Scanner;

class valentineShoping
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();

		String ans[] = new String[t];
		

		for(int i=0;i<t;i++)
		{
			ans[i]="";
			int N = in.nextInt();
			int M = in.nextInt();
			
			int table[][] = new int[M*N][3];
			
			for(int j=0;j<(M*N);j++)
			{
				for(int k=0;k<3;k++)
				{
					table[j][k] = in.nextInt();
				}
			}
			
			int pointer=0;

			for(int x=0;x<N;x++)
			{
				int aValue[] = new int[M];
				for(int y=0;y<M;y++)
				{
					aValue[y]=((100-(table[pointer][0]))*(100-(table[pointer][1]))*(100-(table[pointer][2])));
					pointer++;
				}
				int minValue=aValue[0];
				int minPointer=0;
				for(int y=1;y<M;y++)
				{
					if(minValue>=aValue[y])
					{
						if(minValue==aValue[y])
						{

						}
						else
						{
							minValue=aValue[y];
							minPointer=y;
						}
					}
				}
				
				ans[i] += String.valueOf(minPointer+1);
				ans[i] += " ";
			}
			
			
		}
		
		for(int o=0;o<t;o++)
			System.out.println(ans[o]);

	}
}