//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/

import java.util.*;

class DigitProblem 
{
    public static void main(String args[] ) throws Exception 
    {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		String strs[] = str.split(" ");
		
		char x[] = strs[0].toCharArray();
		int k = Integer.parseInt(strs[1]);

		int z=0;
		
		while(k>0)
		{
			if(x[z] != '9')
			{
				x[z] = '9';
				k--;
			}
			z++;
		}

		System.out.println(x);
		
    }
}
