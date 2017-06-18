//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/monk-teaches-palindrome/

import java.util.*;

class monkTeachPalindrome
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<T; i++)
		{
			String str = in.nextLine();
			
			String rev = new StringBuilder(str).reverse().toString();
			
			if(str.equals(rev))
			{
				if(((str.length())&1) == 1)
					System.out.println("YES ODD");
				else
					System.out.println("YES EVEN");
			}
			else
					System.out.println("NO");
		}
	}
}