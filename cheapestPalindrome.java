//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/make-the-cheapest-palindrome-1/

import java.util.*;

class cheapestPalindrome 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());

        for (int i = 0; i < T; i++) 
        {
			String str = in.nextLine();
			
			int aCost = Integer.parseInt(in.nextLine());
			int bCost = Integer.parseInt(in.nextLine());
			
			
			int cost = 0;
			
			char chars1[] = str.toCharArray();
			
			char chars2[] = new StringBuilder(str).reverse().toString().toCharArray();
						
			int flag = 0;
			
			for(int k=0; k<chars1.length; k++)
			{
				if( (chars1[k] == '/') &&(chars2[k] == '/') )
				{
					if(aCost<bCost)
					{
						chars1[k] = 'a';
						cost += aCost;
					}
					else
					{
						chars1[k] = 'b';
						cost += bCost;
					}
				}
				else if(chars1[k] == '/')
				{
					if(chars2[k] == 'a')
					{
						chars1[k] = 'a';
						cost += aCost;
					}
					else
					{
						chars1[k] = 'b';
						cost += bCost;
					}
				}
				else if(chars2[k] == '/')
				{}
				else if(chars1[k] != chars2[k])
				{
					cost = -1;
					break;
				}
				
				else
				{}
			}
			
			System.out.println(cost);
        }
    }
}
