//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/i-demand-trial-by-combat-13/


import java.util.*;

class DemandTrialByCombat 
{
    public static void main(String args[] ) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) 
        {
			int n = in.nextInt();
			int m = in.nextInt();

			int arr[] = new int[n];
			
			for (int j = 0; j < n; j++) 
				arr[j] = in.nextInt();
			
			
			for (int x = 0; x < m; x++) 
			{
				int arr2[] = new int[n];
				for (int y = 0; y < n; y++) 
				{
					if(y==0)
					{
						if(arr[y+1] == 1)
							arr2[y] = 1;
						else
							arr2[y] = 0;
					}
					else if (y==n-1)
					{
						if(arr[y-1] == 1)
							arr2[y] = 1;
						else
							arr2[y] = 0;						
					}
					else
					{
						if((arr[y-1] == 1) && (arr[y+1] == 1))
							arr2[y] = 1;
						else
							arr2[y] = 0;
					}
				}
				
				if(Arrays.equals(arr,arr2))
					break;
				
				arr = arr2;
			}
			
			for (int j = 0; j < n; j++) 
				System.out.print(arr[j]+ " ");						

			System.out.println();						
        }
    }
}
