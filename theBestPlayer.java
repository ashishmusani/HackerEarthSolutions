//https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/

import java.util.*;

class theBestPlayer
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int T = in.nextInt();
		
		in.nextLine();
		
		String name[] = new String[N];
		int a[] = new int[N];
		
		for(int i=0; i<N; i++)
		{
			String temp[] = (in.nextLine()).split(" ");
			name[i] = temp[0];
			a[i] = Integer.parseInt(temp[1]);
		}
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N-i-1; j++)
			{
				if(a[j] < a[j+1])
				{
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
					
					String z = name[j];
					name[j] = name[j+1];
					name[j+1] = z;
				}
				
				else if(a[j] == a[j+1] && (name[j].compareTo(name[j+1]) > 0))
				{
					String z = name[j];
					name[j] = name[j+1];
					name[j+1] = z;
				}
				else{}
			}
		}
		
		for(int i=0; i<T; i++)
		{
			System.out.println(name[i]);
		}
	}
}