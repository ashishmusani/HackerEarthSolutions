//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/sumit-and-rohil/


import java.util.*;

class SumitAndRohil 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());

		String names[] = new String[T];
		int grouped[] = new int[T];
		
		int total = 0;
		
        for (int i = 0; i < T; i++)
			names[i] = in.nextLine();
		
        for (int i = 0; i < T; i++)
		{
			if(grouped[i] == 0)
			{
				grouped[i] = 1;
				total++;
				
				char[] chars = names[i].toCharArray();
				Arrays.sort(chars);
				String str1 = new String(chars);

				for (int j = i+1; j < T; j++)
				{
					if(grouped[j] == 0)
					{
						if( ( (names[i].charAt(0)) == (names[j].charAt(0)) ) && ( (names[i].charAt(names[i].length()-1)) == 
						(names[j].charAt(names[j].length()-1)) ) )
						{
							char[] chars2 = names[j].toCharArray();
							Arrays.sort(chars2);
							String str2 = new String(chars2);
							
							if(str1.equals(str2))
							{
								grouped[j] = 1;
							}
						}
					}
				}
			}
		}
		
		System.out.println(total);
		
    }
}
