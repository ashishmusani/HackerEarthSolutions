//https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/monk-and-nice-strings-3/


import java.util.*;

class monkAndNiceStrings 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		
		String str[] = new String[N];
		
		for(int i=0; i<N; i++)
			str[i] = in.nextLine();

		
		for(int i=0; i<N; i++)
		{
			int niceness = 0;
			
			for(int j=0;j<i;j++)
			{
				if(str[j].compareTo(str[i]) < 0)
					niceness++;
			}
			
			System.out.println(niceness);
		}

		
    }
}
