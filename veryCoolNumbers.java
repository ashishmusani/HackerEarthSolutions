//https://www.hackerearth.com/problem/algorithm/very-cool-numbers/

import java.util.Scanner;

class veryCoolNumbers
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int R[] = new int[t];
		int K[] = new int[t];
		int totalCount[] = new int[t];
		
		for(int i=0;i<t;i++)
		{
			R[i]=in.nextInt();
			K[i]=in.nextInt();
		}
		
		for(int i=0;i<t;i++)
		{


			for(int p=1;p<=R[i];p++)
			{
				int count=0;
				
				String str=Integer.toBinaryString(p);
				
				
				for(int j=0;j<(str.length()-2);j++)
				{
					if(str.charAt(j)=='1')
					{
						if(str.charAt(j+1)=='0')
						{
							if(str.charAt(j+2)=='1')
							{
								count++;
							}
						}
					}
				}

				if(count>=K[i])
				(totalCount[i])++;
					

			}
			
		}
		
		for(int i=0;i<t;i++)
			System.out.println(totalCount);
	}
}