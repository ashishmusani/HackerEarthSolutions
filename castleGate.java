//https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/the-castle-gate-july-easy/description/


import java.util.*;

class castleGate
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int arr[] = new int[T];
		
		for(int i=0; i<T; i++)
		{
			arr[i] = in.nextInt();
		}
		
		for(int i=0; i<T; i++)
		{
			int count = 0;
			for(int j=1; j<arr[i];j++)
			{
				for(int k=j+1; k<=arr[i];k++)
				{
					if((j^k) <=arr[i] )
						count++;
				}
			}
			
			System.out.println(count);
		}
		
		
	}
}