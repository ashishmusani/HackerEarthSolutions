//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-numbers-1/

import java.util.*;

class jarvisAndNumbers 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) 
        {
			int num=0;
			int N = in.nextInt();
			
			
			for(int j=2; j<N; j++)
			{
				float x = N/j;
				int y = (int)((x-(N/j))*(float)j);
				
				num += (int)x+y;
			}
			System.out.println(num);
        }
    }
}
