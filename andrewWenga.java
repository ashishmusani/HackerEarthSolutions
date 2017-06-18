//https://www.hackerearth.com/problem/algorithm/andrew-and-wengaluru-city/

import java.util.Scanner;

class andrewWenga
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int n;

        int ans[] = new int[t];

        for(int i=0;i<t;i++)
        {
            n = in.nextInt();
            int A[] = new int[n];
            for(int j=0;j<n;j++)
                A[j] = in.nextInt();

            for(int k=1;k<=n-2;k++)
            {
                int shorter;
                int max = A[k+2];

                for(int l=k+2;l<=n;l++)
                {

                }
            }
        }
    }
}
