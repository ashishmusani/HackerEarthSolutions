//https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/add-alternate-elements-of-2-dimensional-array/

import java.util.*;

class addAlternate
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int s1 =0;
		int s2 = 0;
		
		for(int i=1; i<=9; i++)
		{
			if((i&1) == 1)
				s1 += in.nextInt();
			else
				s2 += in.nextInt();
		}

		System.out.println(s1);
		System.out.println(s2);
	}
}