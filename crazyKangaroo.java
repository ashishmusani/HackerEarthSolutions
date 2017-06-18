//https://www.hackerearth.com/problem/algorithm/crazy-kangaroo/

import java.util.Scanner;

class crazyKangaroo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int j;
		
		int a[] = new int[t];
		int b[] = new int[t];
		int m[] = new int[t];
		
		int jumps=0;
		
		for(int i=0;i<t;i++)
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			m[i] = in.nextInt();
		}
		
		for(int i=0;i<t;i++)
		{
			jumps = 0;
			for(j=a[i];j<=b[i];j++)
			{
				if(j%m[i] == 0)
					jumps++;
			}
			
			System.out.println(jumps);
				
		}
		
				
	
	
	}
}