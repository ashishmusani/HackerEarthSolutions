//https://www.hackerearth.com/problem/algorithm/modify-sequence/

import java.util.Scanner;

class modifySequence
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int N=in.nextInt();
		
		boolean flag=true;
		
		int number[]=new int[N];
		
		for(int i=0;i<N;i++)
		{
			number[i]=in.nextInt();
		}

		int i;
		for(i=0;i<N-1;i++)
		{
			if((number[i])>(number[i+1]))
			{
				flag=false;
				break;
			}
			
			else
			{
				number[i+1] = number[i+1]-number[i];
				number[i]=0;
			}
		}
		
		
		if(flag==false)
		{
			System.out.println("NO");
		}
		
		
		else if((number[N-1])!=0)
		{
			System.out.println("NO");
		}

		else
			System.out.println("YES");

	}
}