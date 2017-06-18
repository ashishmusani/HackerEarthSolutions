//https://www.hackerearth.com/practice/algorithms/sorting/counting-sort/practice-problems/algorithm/shil-and-birthday-present/

import java.io.*;
import java.util.*;

class shilAndBirthday 
{
    public static void main(String args[] ) throws Exception 
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		String str[] = br.readLine().split(" ");
		
		int arr[] = new int[N];
		
		long distinct = 1;
		
		for(int i=0; i<N; i++)
			arr[i] = Integer.parseInt(str[i]);
		
		Arrays.sort(arr);
		
        for (int i = 1; i < N; i++) 
        {
			if(arr[i] != arr[i-1])
				distinct++;
        }
		distinct--;
		
		long sum = (distinct*(distinct+1))/2;
		
		System.out.println(sum);
    }
}
