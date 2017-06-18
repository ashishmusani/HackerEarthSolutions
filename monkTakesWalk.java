//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/

import java.io.*;

class monkTakesWalk 
{
    public static void main(String args[] ) throws Exception 
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
        for (int i = 0; i < T; i++) 
        {
			String str = br.readLine();
			
			char chars[] = str.toCharArray();
			
			int ans=0;
			
			for (int j = 0; j < chars.length; j++) 
			{
				if(chars[j] == 'a' || chars[j] == 'e' || chars[j] == 'i' || chars[j] == 'o' || chars[j] == 'u' || 
				chars[j] == 'A' || chars[j] == 'E' || chars[j] == 'I' || chars[j] == 'O' || chars[j] == 'U'  )
					ans++;
				
			}
			System.out.println(ans);
        }
    }
}
