//https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/tutorial/

import java.util.*;

class MDApractise
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
				
		int rows = in.nextInt();
		int cols = in.nextInt();
		
		int mat[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				mat[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; i<cols; i++)
		{
			for(int j=0; j<rows; j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}