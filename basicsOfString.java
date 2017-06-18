//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/tutorial/

import java.util.*;

class basicsOfString {
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T  = in.nextInt();

		in.nextLine();
		
        for (int k = 0; k < T; k++) 
        {			
			String arr[] = (in.nextLine()).split(" ");
			
			
			char str[] = arr[0].toCharArray();
			int n = Integer.parseInt(arr[1]);
			int m = Integer.parseInt(arr[2]);
			
			Arrays.sort(str,n,m+1);
			
			for(int i=0; i<n; i++)
				System.out.print(str[i]);

			for(int i=m; i>=n; i--)
				System.out.print(str[i]);
			
			for(int i=m+1; i<str.length; i++)
				System.out.print(str[i]);
			
			System.out.println();
        }
		

    }
}
