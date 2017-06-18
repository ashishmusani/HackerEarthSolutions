//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/compiler-version-2/

import java.util.*;

class compilerVersion
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			String s = in.nextLine();
			
			if(s == null)
				System.exit(0);
			
			String arr[] = s.split("//");
			
			String str = arr[0].replace("->",".");
			
			if(arr.length>1)
				System.out.println(str+"//"+arr[1]);
			else
				System.out.println(str);
		}
	}
}