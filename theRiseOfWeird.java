//https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/the-rise-of-the-weird-things-1/

import java.util.*;

class theRiseOfWeird
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		
		String str[] = in.nextLine().split(" ");
		
		int arr[] = new int[str.length];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(str[i]);
		
		
		int p1=0;
		int p2=0;
		
		int arr1[] = new int[N];
		int arr2[] = new int[N];
		
		for(int i=0; i<arr.length; i++)
		{
			if((arr[i] % 2) == 1)
			{
				arr2[p2] = arr[i];
				p2++;
			}
		
			else
			{
				arr1[p1] = arr[i];
				p1++;				
			}
		}
		
		Arrays.sort(arr1,0,p1);
		Arrays.sort(arr2,0,p2);
		
		int sum=0;
		
		for(int i=0; i<p1; i++)
		{
			System.out.print(arr1[i]+" ");
			sum += arr1[i];
		}
		System.out.print(sum+" ");
		
		sum = 0;
		
		for(int i=0; i<p2; i++)
		{
			System.out.print(arr2[i]+" ");
			sum += arr2[i];
		}
		System.out.print(sum+" ");
	}
}