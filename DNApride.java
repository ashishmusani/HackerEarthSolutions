//https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/dna-pride/

import java.util.*;

class DNApride
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<T; i++)
		{
			int N = Integer.parseInt(in.nextLine());
			
			char arr[] = new char[N];
			
			arr = in.nextLine().toCharArray();
			
			int flag = 0;
			
			for(int k=0; k<arr.length; k++)
			{
				switch(arr[k])
				{
					case 'A':
						arr[k] = 'T';
						break;
					case 'T':
						arr[k] = 'A';
						break;
					case 'G':
						arr[k] = 'C';
						break;
					case 'C':
						arr[k] = 'G';
						break;
					default:
						flag = 1;
						break;
				}
			}
			
			if(flag == 0)
				System.out.println(arr);
			else
				System.out.println("Error RNA nucleobases found!");			
		}
	}
}