//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/palindrome-124/

import java.util.*;

class pallindrome
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
				System.out.println("YES");
			}
			else
					System.out.println("NO");
		}
	}
}