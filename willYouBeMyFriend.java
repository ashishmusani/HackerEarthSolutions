//https://www.hackerearth.com/problem/algorithm/will-you-be-my-friend-pledge-easy/

import java.util.Scanner;

class willYouBeMyFriend
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int n=in.nextInt();
	
	int friends=0;
	
	int no[]=new int[n];
	
	for(int i=0;i<n;i++)
	no[i]=in.nextInt();
	
	
	boolean flag=false;
	for(int j=0;j<n;j++)
	{

		for(int k=2;(k<=(a/2)) || (k<=(no[j]/2));k++)
		{
			if(((a%k)==0)&&(((no[j])%k)==0))
			{
			friends++;
			break;
			}
		}
	
	}
	
	System.out.println(friends);

	}
}