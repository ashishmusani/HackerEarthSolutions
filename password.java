//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/password-1/

import java.util.*;

class password 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());

		HashSet hs = new HashSet();
        for (int i = 0; i < T; i++)
		{
			String str = in.nextLine();
			String rev = new StringBuilder(str).reverse().toString();
			
			if(hs.isEmpty()==true || hs.contains(rev)==false)
				hs.add(str);
			else
			{
				System.out.println(rev.length()+" "+rev.charAt(rev.length()/2));
			}
		}
    }
}
