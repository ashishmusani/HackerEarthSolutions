//https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/roy-and-symmetric-logos-1/

import java.util.*;

class RoySymmetricLogo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	
		int t = Integer.parseInt(in.nextLine());
		
		while(t-- > 0)
		{
			int n = Integer.parseInt(in.nextLine());
			
			char mat[][] = new char[n][n];
			
			for(int i=0; i<n; i++)
			{
				mat[i] = (in.nextLine()).toCharArray();
			}

			int flag = 0;
			
			for(int i=0; i<(n/2); i++)
			{
				for(int j=0; j<n; j++)
				{
					if(mat[i][j] != mat[n-i-1][j])
					{
						flag = 1;
						break;
					}

					if(flag == 1)
						break;
				}
			}
			
			if(flag ==0)
			{
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<(n/2); j++)
					{
						if(mat[i][j] != mat[i][n-j-1])
						{
							flag = 1;
							break;
						}

						if(flag == 1)
							break;
					}
				}				
			}
			
			if(flag == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}