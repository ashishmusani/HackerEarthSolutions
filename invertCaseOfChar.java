//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/invert-case-of-character/

import java.util.*;

class invertCaseOfChar
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String val = in.nextLine();
		String vals[] = val.split(" ");
		
		int n = Integer.parseInt(vals[0]);
		int m = Integer.parseInt(vals[1]);
		
		n--;
		m--;
		
		
		char[] chars = str.toCharArray();
		
		if(Character.isUpperCase(chars[n]))
			chars[n] = Character.toLowerCase(chars[n]);
		else
			chars[n] = Character.toUpperCase(chars[n]);

		if(Character.isUpperCase(chars[m]))
			chars[m] = Character.toLowerCase(chars[m]);
		else
			chars[m] = Character.toUpperCase(chars[m]);

		System.out.println(chars);
	}
}