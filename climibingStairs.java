//https://www.hackerearth.com/problem/algorithm/climbing-stairs-1/

import java.util.Scanner;

class climibingStairs
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		
		int i=0;
		int days=0;
		
		while(i<n)
		{
			days++;
			i = i+a;
			if(i>=n)
			break;
			i=i-b;
		}
		
		System.out.println(days);
	}
}