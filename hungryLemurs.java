//https://www.hackerearth.com/problem/algorithm/hungry-lemurs/description/

import java.util.Scanner;

class hungryLemurs
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int k = in.nextInt();
		
		int leastDifference;
		
		if(n-(k*(n/k))<=(k*((n/k)+1)-n))
		leastDifference = (n-(k*(n/k)));
		else
		leastDifference = ((k*((n/k)+1)-n));
		
		System.out.println(leastDifference);
	}
}